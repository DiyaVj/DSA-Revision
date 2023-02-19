import java.util.Scanner;

/**
 * Removing_Digits
 */
public class Removing_Digits {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int dp[]=new int[a+1];
    for (int i = 0; i <=a; i++) {
        if (i<10) {
            dp[i]=1;
        }
        else{
            int x=i;
            int max=Integer.MIN_VALUE;
            while (x>0) {
                max=Math.max(x%10, max);
                x=x/10;
            }
            // System.out.println(max);
            dp[i]=1+dp[i-max];
        }
    }
    System.out.println(dp[a]);
    // return dp[a+1];
    }
}