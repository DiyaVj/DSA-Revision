#include <bits/stdc++.h>
using namespace std;
const long long int MOD = 1e9 + 7;
int main()
{
  long long int n, target;
  cin >> n >> target;
  long long int coins[n];
  for (long long int i = 0; i < n; i++)
  {
    cin >> coins[i];
    /* code */
  }


  vector<long long int> dp(target + 1, 0);
  dp[0] = 1;
  for (long long int i = 1; i <= target; i++) {
    for (long long int j = 0; j < n; j++) {
      if (i - coins[j] >= 0) {
        (dp[i] += dp[i - coins[j]]) %MOD;
      }
    }
  }
  cout << dp[target] % MOD;
}
