#include<bits/stdc++.h>
using namespace std;
int main(){
    long long int n;
    cin>>n;
    vector<long long int>dp(n+1,0);
     for (int i = 0; i <=n; i++) {
        if (i<10) {
            dp[i]=1;
        }
        else{
            int x=i;
            int maxi=INT_MIN;
            while (x>0) {
                maxi=max(x%10, maxi);
                x=x/10;
            }
            // System.out.println(max);
            dp[i]=1+dp[i-maxi];
        }
    }
    cout<<dp[n];
}