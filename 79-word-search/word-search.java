class Solution {
    private static final int[][] DIRECTIONS = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == word.charAt(0)) {
                    if (dfs_search(board, word, r, c, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs_search(char[][] board, String word, int currentRow, int currentCol, int wordIndex) {
        if (wordIndex == word.length()) {
            return true;
        }

        if (currentRow < 0 || currentRow >= board.length ||
            currentCol < 0 || currentCol >= board[0].length) {
            return false;
        }

        if (board[currentRow][currentCol] != word.charAt(wordIndex)) {
            return false;
        }

        char originalChar = board[currentRow][currentCol];
        board[currentRow][currentCol] = '#';

        for (int[] dir : DIRECTIONS) {
            int nextRow = currentRow + dir[0];
            int nextCol = currentCol + dir[1];

            if (dfs_search(board, word, nextRow, nextCol, wordIndex + 1)) {
                board[currentRow][currentCol] = originalChar;
                return true;
            }
        }

        board[currentRow][currentCol] = originalChar;
        return false;
    }
}
