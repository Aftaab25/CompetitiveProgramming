#include <bits/stdc++.h>
using namespace std;

#define ll long long

void solve(vector<int>& arr, int x, int n) {
    set<int> pos;
    multiset<int> len;

    pos.insert(0);
    pos.insert(x);
    len.insert(x);

    for (int i=0; i<arr.size(); ++i) {
        pos.insert(arr[i]);
        auto it = pos.find(arr[i]);
        int prevV = *prev(it);
        int nextV = *next(it);
        // cout << prevV << " " << nextV << endl;
        // cout << "dfdf\n";
        auto it2 = len.find(nextV - prevV);
        // cout << prevV - nextV << endl;
        if (it2 != len.end()) {
            len.erase(it2);
        }
        // len.erase(len.find(8));
        len.insert(nextV - arr[i]);
        len.insert(arr[i] - prevV);

        // cout << *len.rbegin() << " ";
    }


    cout << endl;
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    ios::sync_with_stdio(0);
    cin.tie(NULL);

    int x,n;
    cin >> x >> n;

    vector<int> arr(n);
    for (int i=0; i<n; ++i) {
        cin >> arr[i];
    }
    
    solve(arr, x, n);

    return 0;
}
