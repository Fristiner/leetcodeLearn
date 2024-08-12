/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
      // dp[i] = max{ dp[i-j]*j, (i-j) * j}
      int[] dp = new int[n+1];
      dp[2] = 1;
      for(int i = 3;i<=n;i++){
        for(int j = 1;j<i;j++){
          dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
        }
      }
      return dp[n];
    }
}
// @lc code=end

