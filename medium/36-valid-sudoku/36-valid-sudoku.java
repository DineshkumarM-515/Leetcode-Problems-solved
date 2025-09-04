                if (colvalid.contains(board[j][col]))
                    return false;
                colvalid.add(board[j][col]);
            for (int j = 0; j < 9; j++) {
                if (board[j][col] == ('.'))
                    continue;
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> colvalid = new HashSet<>();
                if (board[row][j] == ('.'))
                    continue;
                if (rowvalid.contains(board[row][j]))
                    return false;
                rowvalid.add(board[row][j]);
            }
        for (int row = 0; row < 9; row++) {
            Set<Character> rowvalid = new HashSet<>();
            for (int j = 0; j < 9; j++) {
    public boolean isValidSudoku(char[][] board) {
class Solution {