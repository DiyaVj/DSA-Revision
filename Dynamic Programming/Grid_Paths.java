import java.util.Scanner;

/**
 * Grid_Paths
 */
public class Grid_Paths {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        char[][] grid=new char[n][n]; 
        int[][] dp=new int[n][n]; 
        


        for (int i = 0; i < n; i++)
        { 
            for (int j = 0; j < n; j++)
            { 
                grid[i][j] = sc.next().charAt(0);
            } 
        } 
        for (int i = 1; i <n; i++) {
            for (int j = 1; j <n; j++) {
                if((i==0||j==0) && grid[i][j]!='*') grid[i][j]=1;
                else if(grid[i][j]=='*') dp[i][j]=dp[i-1][j]+dp[i][j-1];

            }
        }
        System.out.println(dp[n-1][n-1]);
        // return dp[n-1][n-1];
    }
}