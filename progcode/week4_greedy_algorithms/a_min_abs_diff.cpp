#include <bits/stdc++.h>
using namespace std;

#define ll long long

void solve(vector<int> arr, int n) {
    sort(arr.begin(), arr.end());

    ll mini = INT_MAX;
    for (int i=1; i<arr.size(); ++i) {
        mini = min(mini, (ll)abs(arr[i] - arr[i-1]));
    }

    cout << mini << endl;
}

int main() {

// #ifndef ONLINE_JUDGE
//     freopen("../input.txt", "r", stdin);
//     freopen("../output.txt", "w", stdout);
// #endif

    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i=0; i<n; ++i) {
        cin >> arr[i];
    }
    
    solve(arr, n);

    return 0;
}
