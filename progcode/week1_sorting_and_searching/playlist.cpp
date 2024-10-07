#include<bits/stdc++.h>
using namespace std;

// #define ll long long

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    // ios::sync_with_stdio(0);
    // cin.tie(NULL);
    // cout.tie(NULL);

    int n;
    scanf("%d", &n);

    // vector<int> arr(n);
    // for (int ii=0; ii<n; ++ii) {
    //     cin >> arr[ii];
    // }

    // int count = 0;
    int ans = 0;
    int start= 0;
    int x;

    map<int, int> umap;
    for (int i=0; i<n; ++i) {
        scanf("%d", &x);
        if (umap.find(x) != umap.end() && umap[x] >= start) {
            // repeatation
            // ans = max(ans, i - start);
            start = umap[x]+1;
            // cout << "i: " << i << " ans: " << ans << " count: " << count << endl;
        }
        // else {
        umap[x] = i;
        ans = max(ans, i - start + 1);
        // }
    }
    // ans = max(ans, n - start);

    // for (const auto it: umap) {
    //     cout << it.first << " " << it.second << endl;
    // }

    printf("%d\n", ans);

    return 0;
}
