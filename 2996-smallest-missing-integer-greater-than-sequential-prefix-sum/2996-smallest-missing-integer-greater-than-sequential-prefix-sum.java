class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        int j=0;
        while(j<nums.length){
            if(nums[j]==sum){
                sum++;
                j=0;
            }else{
                j++;
            }
        }
        return sum;
    }
}