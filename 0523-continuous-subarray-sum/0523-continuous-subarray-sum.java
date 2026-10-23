class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // check if the length is greater than 2
        if(nums.length<2){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int current_sum = 0;
        for(int i = 0; i<nums.length;i++){
            current_sum += nums[i];
            int remainder = current_sum % k ;
            if(remainder < 0){
                remainder += k;
            }
            if(map.containsKey(remainder)){
                int prevIndex = map.get(remainder);
            if (i - prevIndex >= 2) {
                
                return true;
            }}
            else{
                map.put(remainder,i);
            }
        }
        return false;
    }
}