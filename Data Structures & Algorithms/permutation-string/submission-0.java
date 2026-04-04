class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);

        for(int i = 0; i <= s2.length() - n; i++) {
            char[] window = s2.substring(i, i + n).toCharArray();
            Arrays.sort(window);

            if(Arrays.equals(s1Arr, window)) {
                return true;
            }
        }
        return false;
    }
}