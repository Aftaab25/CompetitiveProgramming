#include <bits/stdc++.h>
using namespace std;

#define ll long long

// void printpq(priority_queue<pair<int, int>> pq) {
//     while(!pq.empty()) {
//         cout << pq.top().first << " " << pq.top().second << endl;
//         pq.pop();
//     }
// }

void solve(vector<int>& arr, int k, int n) {
    sort(arr.begin(), arr.end());

    int ans = INT_MAX;
    int t = n - k + 1;
    for (int i=0; i<t; ++i)
        ans = min(arr[i+k-1] - arr[i], ans);

    cout << ans << endl;
}

int main() {

// #ifndef ONLINE_JUDGE
//     freopen("../input.txt", "r", stdin);
//     freopen("../output.txt", "w", stdout);
// #endif

    int n, k;
    cin >> n >> k;

    vector<int> arr(n);
    // vector<int> T(n);
    for (int i=0; i<n; ++i) {
        cin >> arr[i];
    }
    
    solve(arr, k, n);

    return 0;
}

/*

*/