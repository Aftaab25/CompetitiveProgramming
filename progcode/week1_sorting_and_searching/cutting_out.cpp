#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define nline "\n"

bool check(vector<pair<int, int>>& pairs, int k, int n, ll mid, vector<int>& ans) {
    int i=0;
    int count = 0;

    vector<int> check;

    for (const auto pair: pairs) {
        if (pair.first >= mid) {
            int temp = pair.first/mid;
            count += temp;
            for (int i=0; i<temp; ++i) {
                if (check.size() < k)
                    check.push_back(pair.second);
            }
        }
        if (check.size() == k) {
            i=0;
            for (const int it: check) {
                ans[i++] = it;
            }
            return true;
        }
    }

    return false;
}

void solve(vector<int>& arr, int n, int k) {
    unordered_map<int, int> freq;
    for (const int i: arr) {
        freq[i]++;
    }

    vector<pair<int, int>> pairs;
    for (const auto it: freq) {
        pairs.push_back({it.second, it.first});
    }

    sort(pairs.begin(), pairs.end(), greater<>());

    int l = 1;
    int r = n/k;

    vector<int> ans(k);

    while(l <= r) {
        ll mid = (l + r) >> 1;
        if (check(pairs, k, n, mid, ans)) {
            l = mid + 1;
        }
        else {
            r = mid - 1;
        }
    }

    for (const int i: ans)
        cout << i << " ";

}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    ios::sync_with_stdio(0);
    cin.tie(NULL);

    int n,k;
    cin >> n >> k;

    vector<int> arr(n);
    for (int i=0; i<n; ++i) {
        cin >> arr[i];
    }
    
    solve(arr, n, k);

    return 0;
}

/*

4
1 3 1 3 10 3 7 7 12 3

3 - 4
1 - 2
7 - 2
10 - 1
12 - 1

1 -> 4

*/