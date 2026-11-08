
class Solution {
    public int numEnclaves(int[][] arr) {

        Queue<Pair> q = new LinkedList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int j = 0; j < n; j++) {
            if(arr[0][j] == 1) {
                arr[0][j] = -1;
                q.add(new Pair(0, j));
            }
            if(arr[m-1][j] == 1) {
                arr[m-1][j] = -1;
                q.add(new Pair(m-1, j));
            }
        }
        for(int i = 0; i < m; i++) {
            if(arr[i][0] == 1) {
                arr[i][0] = -1;
                q.add(new Pair(i, 0));
            }
            if(arr[i][n-1] == 1) {
                arr[i][n-1] = -1;
                q.add(new Pair(i, n-1));
            }
        }
        while(q.size() > 0) {
            Pair p = q.remove();
            int row = p.row;
            int col = p.col;
            if(col-1 >= 0 && arr[row][col-1] == 1) {
                arr[row][col-1] = -1;
                q.add(new Pair(row, col-1));
            }
            if(col+1 < n && arr[row][col+1] == 1) {
                arr[row][col+1] = -1;
                q.add(new Pair(row, col+1));
            }
            if(row-1 >= 0 && arr[row-1][col] == 1) {
                arr[row-1][col] = -1;
                q.add(new Pair(row-1, col));
            }
            if(row+1 < m && arr[row+1][col] == 1) {
                arr[row+1][col] = -1;
                q.add(new Pair(row+1, col));
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1)
                    count++;
            }
        }
        return count;
    }
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
