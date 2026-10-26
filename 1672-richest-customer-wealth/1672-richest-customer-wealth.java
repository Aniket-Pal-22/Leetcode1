class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_sum = 0;
        for(int i = 0; i<accounts.length; i++){
            int current_sum = 0;
            for(int j = 0 ; j< accounts[0].length; j++){
                current_sum += accounts[i][j];
            }
            if(current_sum > max_sum){
                max_sum = current_sum;
                
            }

        }
        return max_sum;
    }
}