class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)> arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }

        }
        // now combine both arr to print the res (concat both array)
        int[] res = new int[nums.length];
        int index=0;
        for(int a:arr1){
            res[index++]=a;
        }
        for(int a: arr2){
            res[index++]=a;
        }
        return res;
    }
}