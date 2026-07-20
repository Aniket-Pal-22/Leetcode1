class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentsum = 0;
        for(int i=0;i<k;i++){
            currentsum += nums[i];

        }
        double sum = currentsum;
        for(int i=k;i<nums.length;i++){
            currentsum += nums[i] - nums[i-k];
            sum = Math.max(sum,currentsum);
        }
        sum = sum/k;
         
         return sum;
    }
}