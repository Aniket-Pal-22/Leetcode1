class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        // as the 0th element alweays be unique,so we start from index 1
        int j =1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]= nums[i];
                j++;

            }
        }
        return j;
    }
}