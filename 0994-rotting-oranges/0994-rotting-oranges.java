class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                }
            }
        }
        int maxtime = 0;
        while(q.size()>0){
            int[] front = q.poll();
            int a = front[0];
            int b = front[1];
            int c = front[2];
            maxtime = Math.max(maxtime,c);
            if(a-1>=0 && grid[a-1][b] == 1){
                q.offer(new int[]{a-1,b,c+1});
                grid[a-1][b] = 2;
            }
            if(a+1<m && grid[a+1][b] == 1){
                q.offer(new int[]{a+1,b,c+1});
                grid[a+1][b] = 2;
            }
            if(b-1>=0 && grid[a][b-1] == 1){
                q.offer(new int[]{a,b-1,c+1});
                grid[a][b-1] = 2;
            }
            if(b+1<n && grid[a][b+1] == 1){
                q.offer(new int[]{a,b+1,c+1});
                grid[a][b+1] = 2;
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1){
                   return -1;
                }
            }
        }
        return maxtime;
        
    }
}