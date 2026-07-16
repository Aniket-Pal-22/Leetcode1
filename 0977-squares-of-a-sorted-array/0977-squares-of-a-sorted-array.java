class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        int j= nums.length-1;
        int[] result=new int[nums.length];
        int p = nums.length-1;
        while(i<=j){
            int iSquare= nums[i]*nums[i];
            int jSquare= nums[j]*nums[j];
            if(iSquare<jSquare){
                result[p] = jSquare;
                j--;

            }
            else{
                result[p]= iSquare;
                i++;
            }
            p--;


        }
        return result;
    }
}