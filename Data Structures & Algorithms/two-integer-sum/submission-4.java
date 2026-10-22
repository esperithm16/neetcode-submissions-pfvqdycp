class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      HashMap<Integer,Integer>mapp=new HashMap<>();
      for(int i = 0 ; i<nums.length;i++){
        int diff=target-nums[i];
        if(mapp.containsKey(diff)){
return new int[]{mapp.get(diff),i};        }
        else mapp.put(nums[i],i);
      } 
      return new int[]{}; 
    }
}
