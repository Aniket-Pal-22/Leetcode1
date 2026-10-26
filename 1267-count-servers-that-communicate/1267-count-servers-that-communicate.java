class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n =  grid[0].length;
        // making 2 arrays which helps in keeping check for servers on each row n col
        int[] row = new int[m];
        int[] col = new int[n];
      
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){

             if(grid[i][j]==1  ){
                row[i]++;
                col[j]++;
             }
            }}
            int servers = 0;
            for(int i = 0; i<m; i++){
                for(int j =0 ; j<n;j++){
                    if(grid[i][j]==1){
                        if(row[i]>1 || col[j]>1){
                            servers++;
                        }
                    }
                }
            }
        
        return servers;
    }
}