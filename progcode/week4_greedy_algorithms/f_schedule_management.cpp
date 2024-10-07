#include <bits/stdc++.h>
using namespace std;

#define ll long long

// void printpq(priority_queue<pair<int, int>> pq) {
//     while(!pq.empty()) {
//         cout << pq.top().first << " " << pq.top().second << endl;
//         pq.pop();
//     }
// }

void solve(vector<int>& arr, int m, int n) {
    // n is the number of workers
    // m is the number of tasks

    sort(arr.begin(), arr.end());

    int ans = INT_MAX;
    // int t = n - k + 1;
    // for (int i=0; i<t; ++i)
    //     ans = min(arr[i+k-1] - arr[i], ans);

    cout << ans << endl;
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    int t;
    cin >> t;
    while (t-->0) {
        int n, m;
        cin >> n >> m;

        vector<int> arr(m);
        for (int i=0; i<m; ++i) {
            cin >> arr[i];
        }
        
        solve(arr, m, n);
    }

    return 0;
}

/*

*/