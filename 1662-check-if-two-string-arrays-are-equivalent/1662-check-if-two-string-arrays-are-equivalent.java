class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans = new StringBuilder();
        StringBuilder ans1 =new StringBuilder();
       for(int i=0;i<word1.length;i++){
        ans.append(word1[i]);
       }
       for(int j=0;j<word2.length;j++){
        ans1.append(word2[j]);
       }
       return ans.toString().equals(ans1.toString());
    }
}