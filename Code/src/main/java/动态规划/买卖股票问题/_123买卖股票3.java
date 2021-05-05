package 动态规划.买卖股票问题;

public class _123买卖股票3 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = Math.max(dp[i-1][1] , dp[i-1][0]-prices[i]);
            dp[i][2] = Math.max(dp[i-1][1]+prices[i],dp[i-1][2]);
            dp[i][3] = Math.max(dp[i-1][2]-prices[i],dp[i-1][3]);
            dp[i][4] = Math.max(dp[i-1][3]+prices[i],dp[i-1][4]);
        }
        return dp[prices.length-1][4];
    }
}
