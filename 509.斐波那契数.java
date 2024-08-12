/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
      if (n<2){
        return n;
      }
      int[] arr = new int[n+1];
      arr[0] = 0;
      arr[1] = 1;
      for(int i = 2;i<=n;i++){
        arr[i] = arr[i-1] + arr[i-2];
      }
      return arr[n];
    }
}
// @lc code=end

