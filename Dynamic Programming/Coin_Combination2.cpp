#include <bits/stdc++.h>
using namespace std;
int main()
{
  int n, target;
  int coins[n];
  vector<vector<int>> dp(n, vector<int>(target + 1, 0));
  for (int i = 0; i < n; i++)
  {
    dp[i][0] = 1;
    /* code */
  }
  for (int i = 1; i < n; i++)
  {
    for (int j = 1; j<= target; j++)
    {
      int notpick=dp[i-1][j];
      int pick=0;
      if (coins[i]<=j) pick=dp[i-1][j-coins[i]];
      
    dp[i][j]=pick+notpick;
    }
  }
  cout<<dp[n][target+1];
}