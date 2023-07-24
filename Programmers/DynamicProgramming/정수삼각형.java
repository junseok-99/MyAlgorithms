import java.util.*;

/**
 * Lv 3 정수 삼각형
 */
class Solution {
    public int solution(int[][] t) {
        int answer = 0;
        int[][] dp = new int[t.length][];

        for(int i=0;i<t.length;i++)
            dp[i] = new int[t[i].length];

        dp[0][0] = t[0][0];

        for(int i=1;i<t.length;i++){
            int len = t[i].length;
            for(int j=0;j<len;j++){
                if(j==0) dp[i][j] = t[i][j] + dp[i-1][j];
                else if(j==len-1) dp[i][j] = t[i][j] + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j-1]+t[i][j], dp[i-1][j]+t[i][j]);

                if(dp[i][j] > answer) answer = dp[i][j];
            }
        }

        return answer;
    }
}