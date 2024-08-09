/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] A, int amount) {
      int[] f = new int[amount+1];
      int n = A.length;

      // init
      f[0] = 0;
      int i,j;
      for(i = 1;i<= amount;i++){
        f[i] = Integer.MAX_VALUE;
        // f[i] = min{f[i-A[0] + 1 , .... , f[i-A[n-1]] + 1}
        // 枚举最后一枚硬币 
        for(j=0;j<n;j++){
          if(i >= A[j] && f[i - A[j]] != Integer.MAX_VALUE){
            f[i] = Math.min(f[i],f[i-A[j]]+1);
          }
        }
      }
      if(f[amount] == Integer.MAX_VALUE){
        f[amount] = -1;
      }

      return f[amount];

    }
}
// @lc code=end

