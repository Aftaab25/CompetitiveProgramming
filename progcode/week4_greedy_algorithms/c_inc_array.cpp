#include <bits/stdc++.h>
using namespace std;

#define ll long long

void solve(vector<int> arr, int n) {
    // sort(arr.begin(), arr.end());

    ll ans = 0;
    for (int i=1; i<n; ++i) {
        if (arr[i] < arr[i-1]) {
            ans += arr[i-1] - arr[i];
            arr[i] = arr[i-1];
        }
    }

    cout << ans << endl;
}

int main() {

#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i=0; i<n; ++i) {
        cin >> arr[i];
    }
    
    solve(arr, n);

    return 0;
}
