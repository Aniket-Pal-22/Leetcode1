class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = binarySearch(nums, target, true);
        
        if (firstPos == -1) {
            return new int[] {-1, -1};
        }
        
        int lastPos = binarySearch(nums, target, false);
        return new int[] {firstPos, lastPos};
    }
    
    private int binarySearch(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;  
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return bound;
    }
}