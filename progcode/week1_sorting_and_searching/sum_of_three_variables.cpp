#include <bits/stdc++.h>
using namespace std;

#define ll long long

void solve(vector<pair<ll, int>>& arr, ll x) {
    sort(arr.begin(), arr.end());

    for (int i=0; i<arr.size(); ++i) {
        int l=i+1;
        int r = arr.size()-1;

        while (l < r) {
            ll sum = arr[i].first + arr[l].first + arr[r].first;

            if (sum == x) {
                // cout << arr[i].first << " " << arr[l].first << " " << arr[r].first << endl;
                printf("%d %d %d\n", arr[i].second+1, arr[l].second+1, arr[r].second+1);
                return;
            }
            else if (sum < x) {
                l++;
            }
            else r--;
        }
    }

    // printf("%d %d %d\n", i+1, j+1, idx+1);

    cout << "IMPOSSIBLE" << endl;
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    ios::sync_with_stdio(0);
    cin.tie(NULL);

    int n;
    ll x;
    cin >> n >> x;

    vector<pair<ll, int>> arr(n);
    for (int i=0; i<n; ++i) {
        ll val;
        cin >> val;
        arr[i] = {val, i};
    }
    
    solve(arr, x);

    return 0;
}
