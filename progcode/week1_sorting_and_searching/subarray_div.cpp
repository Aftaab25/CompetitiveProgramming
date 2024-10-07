#include <bits/stdc++.h>
using namespace std;

#define ll long long

void solve(vector<int> arr) {
    int k = arr.size();
    unordered_map<int, ll> umap;
    umap[0] = 1;
    ll prefixSum = 0;
    ll count = 0;
    for (int i=0; i<arr.size(); ++i) {
        prefixSum += arr[i];
        // if (prefixSum % k == 0) count++;
        ll rem = (prefixSum % k + k)%k;

        if (umap.find(rem) != umap.end()) {
            count += umap[rem];
        }

        umap[rem]++;
    }

    cout << count << endl;
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
    
    solve(arr);

    return 0;
}
