import java.util.Arrays;
import java.util.Scanner;

/**
 * Coin_Combinations_I
 */
public class Coin_Combinations_I {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;int target;
        n=sc.nextInt();
        target=sc.nextInt();
        int[] coins=new int[n+1];

        for (int i = 0; i < n; i++) {
            coins[i]=sc.nextInt();
        }
        int dp[]=new int[target+1];
        dp[0]=1;
        for (int i = 0; i <=target; i++) {
            for (int j = 0; j < n; j++) {
                if(coins[j]<=i) dp[i]+=dp[i-coins[j]];
            }
        }
        // return dp[target];
        System.out.println(dp[target]);
    }
}