#include <bits/stdc++.h>
 
using namespace std;
 
int N, k, l, ans;
map<int,int> mp;
 
int main(){
#ifndef ONLINE_JUDGE
    freopen("../input.txt", "r", stdin);
    freopen("../output.txt", "w", stdout);
#endif
    scanf("%d", &N);
 
    l = 1;
    for(int r = 1; r <= N; r++){
        scanf("%d", &k);
        if(mp[k]){
            ans = max(ans, r-l);
            l = max(l, mp[k]+1);
            mp[k] = r;
        } else {
            ans = max(ans, r-l+1);
            mp[k] = r;
        }
    }
 
    ans = max(N-l+1, ans);
    printf("%d\n", ans);
}