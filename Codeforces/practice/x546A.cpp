#include <bits/stdc++.h>
using namespace std;

double valueE(double x){
	return log(x);
}

void solve(){
	int a, b;
	cin >> a >> b;
	int ans = 0;
	cout << floor(valueE((double)b/a)/valueE(1.5)) + 1<< endl;
}

int main(){
	int T=1;
	while (T--){
		solve();
	}
	return 0;
}