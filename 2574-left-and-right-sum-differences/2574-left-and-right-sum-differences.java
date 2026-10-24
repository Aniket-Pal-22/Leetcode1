class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right_sum = 0;
        for(int num : nums){
            right_sum += num;
           
        }
        int left_sum = 0;
        int [] differnce = new int[nums.length];
        for(int j = 0; j<nums.length;j++){
            right_sum -= nums[j];
            differnce[j] = Math.abs(left_sum - right_sum);
            left_sum += nums[j];

        }
        return differnce;
    }
}