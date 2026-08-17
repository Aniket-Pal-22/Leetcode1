class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] result = new int[2*n];   // taking a new array of double the sixe of n
       for(int i = 0; i<n;i++){
        result[2*i]= nums[i];         // 2*i is done for shifting the 1st half elements to even position
        result[2*i+1]=nums[n+i];     // 2*i+1 move second half elements to odd positions
       }
       return result;
    }
}