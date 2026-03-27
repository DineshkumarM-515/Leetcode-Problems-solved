class Solution {
    public void reverse(int[] arr,int st,int end){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        k = k%m;
        if(k == 0) return true;

        int[][] copyMat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copyMat[i][j] = mat[i][j];
            }
        }

        int idx = 0;
        for(int[] row : copyMat){
            if(idx % 2 == 0){
                reverse(row,0,k-1);
                reverse(row,k,m-1);
                reverse(row,0,m-1);
            }
            else{
                reverse(row,0,m-1);
                reverse(row,0,k-1);
                reverse(row,k,m-1);
            }
            idx++;
        }

        return Arrays.deepEquals(mat,copyMat);

    }
}