class Solution {

    public int getMaximumGold(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0) {
                    continue;
                }

                max = Math.max(max, helper(grid, i, j));
            }
        }

        return max;
    }

    public int helper(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int gold = grid[i][j];

        grid[i][j] = 0;

        int down = helper(grid, i + 1, j);
        int up = helper(grid, i - 1, j);
        int right = helper(grid, i, j + 1);
        int left = helper(grid, i, j - 1);

        grid[i][j] = gold;

        return gold + Math.max(Math.max(down, up), Math.max(right, left));
    }
}