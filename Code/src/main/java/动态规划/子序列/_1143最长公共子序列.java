package 动态规划.子序列;

public class _1143最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        int res = 0;
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for (int i = 1; i <= text1.length() ; i++) {
            for (int j = 1; j <= text2.length() ; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;


    }
}
