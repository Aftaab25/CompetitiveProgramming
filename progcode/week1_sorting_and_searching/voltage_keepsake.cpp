#include <bits/stdc++.h>
using namespace std;

#define ll long long

bool check(vector<int>& a, vector<int>& b, int n, int p, double mid) {
    double pow = 0.0;

    for (int i=0; i<n; ++i) {
        double temp = a[i] * mid - b[i];
        if (temp > 0) pow += temp;
    }

    return pow <= mid*p;
}

void solve(vector<int>& a, vector<int>& b, int n, int p) {
    
    ll sum = 0;
    for(const int x: a) {
        sum += x;
    }
    if (sum <= p) {
        cout << "-1" << endl;
        return;
    }

    double l = 0.0, r = 1e18;
    while (r - l > 1e-4) {
        double mid = (l + r) / 2;
        if (check(a, b, n, p, mid)) {
            l = mid;
        }
        else {
            r = mid;
        }
    }


    cout << fixed << setprecision(4) << l << endl;
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    ios::sync_with_stdio(0);
    cin.tie(NULL);

    int n, p;
    cin >> n >> p;

    vector<int> a(n), b(n);
    for (int i=0; i<n; ++i) {
        cin >> a[i] >> b[i];
    }

    solve(a, b, n, p);

    return 0;
}
