class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num=0;num<nums.length;num++){
          int compliment=target-nums[num];
          if(map.containsKey(compliment)){
            return new int[]{map.get(compliment),num};
          }
          map.put(nums[num],num);
        }
        return new int[]{};
    }
}
