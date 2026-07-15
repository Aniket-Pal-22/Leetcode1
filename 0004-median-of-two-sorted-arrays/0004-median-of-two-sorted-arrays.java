import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int[] merge = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                              .sorted()
                              .toArray();
        
        int n = merge.length;
        
        
        if (n % 2 == 1) {
            
            return merge[n / 2];
        } else {
            
            return (merge[(n / 2) - 1] + merge[n / 2]) / 2.0;
        }
    }
}