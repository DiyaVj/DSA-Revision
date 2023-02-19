import java.util.Arrays;
import java.util.Scanner;

/**
 * Coin_Combinations_I
 */
public class Coin_Combinations_II {

    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        int n;int target;
        n=sc.nextInt();
        target=sc.nextInt();
        int[] coins=new int[n+1];

        for (int i = 0; i < n; i++) {
            coins[i]=sc.nextInt();
        }
        int dp[][]=new int[n][target+1];
        for (int i = 0; i <=target; i++) {
            if (i%coins[0]==0) dp[0][i]=1;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <n; i++) {
            for (int j = 1; j <=target; j++) {
                int notpick=dp[i-1][j];
                int pick=0;
                if (coins[i]<=j) pick=dp[i][j-coins[i]];
                dp[i][j]=pick+notpick; 
            }
        }

        // return dp[target];
        System.out.println(dp[n-1][target]);
    }
}