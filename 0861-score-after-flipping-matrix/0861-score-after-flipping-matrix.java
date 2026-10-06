class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;int n = grid[0].length;
        for(int i = 0;i<m;i++){
            if(grid[i][0] == 0){
            for(int j = 0;j<n;j++){
                grid[i][j]^=1;
            }
        }
        }
        for(int i = 0;i<n;i++){
            int ones = 0;int zeros = 0;
            for(int j =0;j<m;j++){
                if(grid[j][i] == 0){
                    zeros++;
                }else{
                    ones++;
                }
            }
            if(zeros>ones){
                for(int j = 0;j<m;j++){
                    grid[j][i] ^= 1;
                }
            }
        }
       int sum = 0;
        for (int i = 0; i < m; i++) {
             int rowValue = 0;
             for (int j = 0; j < n; j++) {
                     rowValue = rowValue * 2 + grid[i][j];
             }
                        sum += rowValue;
        }
        return sum;
    }
}