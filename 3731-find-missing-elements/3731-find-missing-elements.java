class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int a: nums){
            min=Math.min(min, a);
            max=Math.max(max, a);
        }
        for(int i=min;i<=max;i++){
            boolean isFound=false;
            for(int a:nums){
                if(a==i){
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                ans.add(i);
            }
        }
        return ans;
    }
}