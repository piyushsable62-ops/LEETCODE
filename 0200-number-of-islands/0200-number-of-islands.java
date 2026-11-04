class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(visited,grid,i,j);
                    count++;
                }
            }
        }
        return count;
        
    }
    public void bfs(boolean[][] visited,char[][] grid,int i ,int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j] = true;
        while(q.size()>0){
            int[] pair = q.poll();
            int first = pair[0];
            int second = pair[1];
           int m = grid.length;
           int n = grid[0].length;
            if(first > 0 && grid[first-1][second] == '1' && !visited[first-1][second]){
                q.add(new int[]{first-1, second});
                visited[first-1][second] = true;
            }
            if(second > 0 && grid[first][second-1] == '1' && !visited[first][second-1]){
                q.add(new int[]{first, second-1});
                visited[first][second-1] = true;
            }
            if(second < n-1 && grid[first][second+1] == '1' && !visited[first][second+1]){
                q.add(new int[]{first, second+1});
                visited[first][second+1] = true;
            }
            if(first < m-1 && grid[first+1][second] == '1' && !visited[first+1][second]){
                q.add(new int[]{first+1, second});
                visited[first+1][second] = true;
        }
    }
    }
}