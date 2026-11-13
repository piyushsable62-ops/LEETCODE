
import java.util.*;

class Solution {

    int m, n;
    boolean[][] visited;

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public boolean containsCycle(char[][] grid) {

        m = grid.length;
        n = grid[0].length;

        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (!visited[i][j]) {

                    if (bfs(grid, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean bfs(char[][] grid, int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, -1, -1});
        visited[x][y] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int px = curr[2];
            int py = curr[3];
            for (int d = 0; d < 4; d++) {
                int nr = r + dx[d];
                int nc = c + dy[d];
                if (nr < 0 || nc < 0 || nr >= m || nc >= n) {
                    continue;
                }
                if (grid[nr][nc] != grid[r][c]) {
                    continue;
                }
                if (nr == px && nc == py) {
                    continue;
                }
                if (visited[nr][nc]) {
                    return true;
                }
                visited[nr][nc] = true;
                q.offer(new int[]{nr, nc, r, c});
            }
        }

        return false;
    }
}
