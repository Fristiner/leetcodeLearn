/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
      if(n<=2){
        return n;
      }
      int[] arr = new int[n+1];
      arr[1] = 1;
      arr[2] = 2;
      for(int i =3; i<=n;i++){
        arr[i] = arr[i-1] + arr[i-2];
      }
      return arr[n];
    }
}
// @lc code=end

