/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      if(strs==null || strs.length ==0 )
        return new ArrayList<>();
      Map<String,List<String>> map = new HashMap<>();
      for(String s : strs){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String s1 = new String(chars);
        if(!map.containsKey(s1)){
          map.put(s1,new ArrayList<>());
        }
        map.get(s1).add(s);
      }
      return new ArrayList<>(map.values());
    }
}
// @lc code=end

