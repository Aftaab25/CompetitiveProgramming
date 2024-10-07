#include <bits/stdc++.h>
using namespace std;

#define ll long long

void solve(int n, int k) {
    // int i=1, count = 0;

    // while (count < k) {
    //     if (i % n != 0) count++;
    //     i++;
    // }

    int l = 1, r = INT_MAX;

    ll ans = INT_MAX;
    while (l <= r) {
        ll mid = l + (r-l)/2;

        ll check = mid - (mid / n);

        if (check < k) {
            l = mid + 1;
        }

        else if (check > k) {
            r = mid - 1;
        }

        else {
            ans = min(mid, ans);
            r = mid - 1;
        }
    }

    cout << ans << endl;
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif
    int t;
    cin >> t;

    while(t-->0) {
        int n, k;
        cin >> n >> k;
        solve(n, k);
    }

    return 0;
}
