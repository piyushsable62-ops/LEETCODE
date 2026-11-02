class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                bfs(isConnected,i,visited);
                count++;
            }
        }  
        return count;
    }
    public void bfs(int[][] isConnected,int i,boolean[] visited){
        int n =  isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while(q.size()>0){
           int x =  q.remove();
            for(int j = 0;j<n;j++){
                if(isConnected[x][j] == 1 && !visited[j]){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }

}