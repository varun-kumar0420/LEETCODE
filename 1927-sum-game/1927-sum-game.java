class Solution {
    public boolean sumGame(String num) {
        int mid=num.length()/2;
        int sum_l=0;
        int sum_r=0;
        int q_l=0;
        int q_r=0;
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);

            if(i<mid){
                if(ch=='?'){
                    q_l++;
                } else{
                    sum_l+=(ch-'0');
                }
            } else{
                if(ch=='?'){
                    q_r++;
                } else{
                    sum_r+=(ch-'0');
                }
            }
        }
        int diff_sum = sum_l - sum_r;
        int diff_q = q_r - q_l;

        if(diff_sum*2==diff_q*9){
            return false;
        }
        return true;
    }
}