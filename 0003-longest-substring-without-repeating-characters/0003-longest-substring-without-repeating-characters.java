class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=i;j<n;j++){
            char ch = s.charAt(j);
            if(hs.contains(ch)){
                break;
            }
            hs.add(ch);
        }
        length=Math.max(length, hs.size());
        }
        return length;
    }
}