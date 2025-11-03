class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] dirn = {{1,0},{-1,0},{0,1},{0,-1},{-1,1},{1,-1},{-1,-1},{1,1}};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int liveneighbours = 0;
                
                for(int[] dir:dirn){
                    int r = i+dir[0];
                    int c = j+dir[1];

                    if(r >= 0 && r < n && c >=0 && c < m && (board[r][c] == 1 || board[r][c] == 2)){
                        liveneighbours++;

                    }
                }

                if(board[i][j] == 1 && (liveneighbours < 2 || liveneighbours > 3)){
                    board[i][j] = 2;
                }
                if(board[i][j] == 0 && (liveneighbours == 3)){
                    board[i][j] = 3;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 2) board[i][j] = 0;
                if(board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
}