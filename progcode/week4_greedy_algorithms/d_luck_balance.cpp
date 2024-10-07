#include <bits/stdc++.h>
using namespace std;

#define ll long long

void printpq(priority_queue<pair<int, int>> pq) {
    while(!pq.empty()) {
        cout << pq.top().first << " " << pq.top().second << endl;
        pq.pop();
    }
}

void solve(vector<int>& L, vector<int>& T, int k, int n) {
    // sort(arr.begin(), arr.end());


    priority_queue<pair<int, int>> pq;
    for (int i=0; i<n; ++i) {
            pq.push({T[i], L[i]});
    }

    // printpq(pq);

    ll ans=0;
    int count = 0;
    while(!pq.empty()) {
        auto f = pq.top().first;
        auto s = pq.top().second;
        pq.pop();

        if (f == 1) {
            if (count < k) {
                ans += s;
            }
            else {
                ans -= s;
            }
            count++;
        } else {
            ans += s;
        }
    }

    // ll ans = 0;
    // for (int i=1; i<n; ++i) {
    //     if (arr[i] < arr[i-1]) {
    //         ans += arr[i-1] - arr[i];
    //         arr[i] = arr[i-1];
    //     }
    // }

    cout << ans << endl;
}

int main() {

// #ifndef ONLINE_JUDGE
//     freopen("../input.txt", "r", stdin);
//     freopen("../output.txt", "w", stdout);
// #endif

    int n, k;
    cin >> n >> k;

    vector<int> L(n);
    vector<int> T(n);
    for (int i=0; i<n; ++i) {
        cin >> L[i] >> T[i];
    }
    
    solve(L, T, k, n);

    return 0;
}

/*

    L[i] -> Luck (for a given contest i)
        - '+L[i]' if loses the contest
        - '-L[i]' if wins the contest

    T[i] -> Importance of contest
        - 1 means imp
        - 0 means not imp

    k => max imp contests Lena can lose

*/