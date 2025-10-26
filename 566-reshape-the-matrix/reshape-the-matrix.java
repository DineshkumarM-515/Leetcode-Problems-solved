class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int n = mat.length;
        int m= mat[0].length;
        if(m*n != r*c) return mat;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k/c][k%c] = mat[i][j];
                k++;
            }
        }

        return arr;
    }
}