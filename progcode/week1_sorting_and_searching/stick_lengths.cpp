#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    int n;
    cin >> n;

    vector<int> arr(n);
    for (int ii=0; ii<n; ++ii) {
        cin >> arr[ii];
    }

    sort(arr.begin(), arr.end());
    ll median = arr[n/2];
    // ll median = arr[(n/2) + 1];
    // cout << arr[n/2] << endl;
    // cout << arr[n/2+1] << endl;
    // cout << median << endl;
    ll ans = 0;
    for (int i=0; i<n; ++i) {
        ans += abs(arr[i]-median);
    }    

    cout << ans << endl;

    return 0;
}
