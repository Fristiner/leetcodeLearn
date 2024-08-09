/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length-1;
        for(int i = 0;i<=k;i++){
          if(nums[i] == val){
            swap(nums,i--,k--);
          }
        }
        return k+1;

    }

    void swap(int[] nums,int i,int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
}
// @lc code=end

