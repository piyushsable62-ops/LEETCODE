class Solution {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (solve(board, word, i, j, 0)) {
                    return true;
                }

            }
        }

        return false;
    }

    public boolean solve(char[][] board, String word, int row, int col, int idx) {

        if (idx == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] != word.charAt(idx)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean ans =
                solve(board, word, row + 1, col, idx + 1) ||   // Down
                solve(board, word, row - 1, col, idx + 1) ||   // Up
                solve(board, word, row, col + 1, idx + 1) ||   // Right
                solve(board, word, row, col - 1, idx + 1);     // Left

        board[row][col] = temp;

        return ans;
    }
}