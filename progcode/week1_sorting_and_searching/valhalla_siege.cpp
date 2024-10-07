#include <bits/stdc++.h>
using namespace std;

#define ll long long

// 1 3 4 6 7
int check(vector<ll>& prefix, ll x) {
    // cout << "x: " << x << endl;

    if (x >= prefix[prefix.size()-1]) return prefix.size();
    ll l = 0, r = prefix.size()-1;
    while (l <= r) {
        ll mid = (l + r) >> 1;
        if (prefix[mid] == x) {
            // cout << "x; " << x << endl;
            return prefix.size() - mid - 1;
        }
        else if (prefix[mid] < x) {
            l = mid + 1;
        }
        else {
            r = mid - 1;
        }
    }


    return (prefix.size() - l);
}

void solve(vector<ll>& a, vector<ll>& k, ll n, ll q) {
    vector<ll> prefix;

    ll sum = 0;
    for (const ll i: a) {
        sum += i;
        prefix.push_back(sum);
    }

    sum = 0;
    for (ll i=0; i<k.size(); ++i) {
        sum += k[i];
        ll ans = check(prefix, sum);
        if (sum >= prefix[prefix.size()-1])
            sum=0;
        cout << ans << " ";
    }
}

int main() {
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif

    ios::sync_with_stdio(0);
    cin.tie(NULL);

    ll n,q;
    cin >> n >> q;

    vector<ll> a(n);
    for (ll i=0; i<n; ++i) {
        cin >> a[i];
    }

    vector<ll> k(q);
    for (ll i=0; i<q; ++i) {
        cin >> k[i];
    }
    
    solve(a, k, n, q);

    return 0;
}
