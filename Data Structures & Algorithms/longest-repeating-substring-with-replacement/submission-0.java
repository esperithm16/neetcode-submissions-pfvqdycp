class Solution {
    public int characterReplacement(String s, int k) {
      int[] frq=new int[26];
      int left=0;
      int length=0;
      int count=0;
      for(int right=0;right<s.length();right++){
        frq[s.charAt(right)-'A']++;
        count=Math.max(count,frq[s.charAt(right)-'A']);
        while((right-left+1)-count>k)
{
    frq[s.charAt(left)-'A']--;
    left++;

}   
length=Math.max(length,right-left+1);   }  
return length;
    }
}
