class Solution {
    public int maximumLengthSubstring(String s) {
        int a=s.length();
        int maxLength=0;
        int l=0;
        for(int r=0;r<a;r++){
            char c=s.charAt(r);
            int firstMatch=s.indexOf(c,l);
            int secondMatch=s.indexOf(c, firstMatch+1);

            if(secondMatch!=-1 && secondMatch<r){
                l=firstMatch+1;
            }
            maxLength=Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }
}