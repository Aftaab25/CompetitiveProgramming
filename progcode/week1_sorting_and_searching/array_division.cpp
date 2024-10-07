#include <bits/stdc++.h>
using namespace std;

#define ll long long

bool check(vector<ll>& arr, int k, ll mid) {
    int count = 0;
    ll sum = 0;
    for (int i=0; i<arr.size(); ++i) {
        if (sum + arr[i] > mid) {
            sum = arr[i];
            count++;
            if (count >= k || sum > mid) return false;
        } else {
            sum += arr[i];
        }
    }

    return true;
}

void solve(vector<ll> arr, int k) {
    // sort(arr.begin(), arr.end());

    ll low = *min_element(arr.begin(), arr.end());
    // ll high = accumulate(arr.begin(), arr.end(), 0);
    ll high = 0;
    for (ll x: arr) {
        high += x;
    }

    // cout << low << " " << high << endl;

    ll ans = high;

    while (low <= high) {
        ll mid = low + (high - low)/2;
        // cout << "mid: " << mid << endl;

        if (check(arr, k, mid)) {
            ans = min(mid, ans);
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    cout << ans << endl;
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    int n, k;
    cin >> n >> k;

    vector<ll> arr(n);
    for (int i=0; i<n; ++i) {
        cin >> arr[i];
    }
    
    solve(arr, k);

    return 0;
}
