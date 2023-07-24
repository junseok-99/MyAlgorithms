import java.util.*;

/**
 * Lv 3 등굣길
 */
class Solution {
    public int solution(int m, int n, int[][] puddles) {

        int[][] dp = new int[n][m];
        dp[0][0] = 1;

        for(int[] pud: puddles)
            dp[pud[1]-1][pud[0]-1] = -1;

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(dp[i][j] == -1) continue;
                if(i+1 < n && dp[i+1][j] != -1) dp[i+1][j] += (dp[i][j]%1000000007);
                if(j+1 < m && dp[i][j+1] != -1) dp[i][j+1] += (dp[i][j]%1000000007);
            }

        return dp[n-1][m-1]%1000000007;
    }
}