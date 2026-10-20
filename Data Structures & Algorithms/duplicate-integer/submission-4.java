class Solution {
    public boolean hasDuplicate(int[] nums) {
        int arr[]=Array.sort(nums);
     for(int i = 1 ; i<arr.length();i++){
        if(arr[i]==arr[i-1]){
        System.out.println("true");
        break;
        }
        
     }  
     System.out.println("false"); 
    }
}