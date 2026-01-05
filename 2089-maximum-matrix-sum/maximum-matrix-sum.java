class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long absSum = 0;
        int absSmall = Integer.MAX_VALUE;
        int negCount = 0;
        for(int[] row:matrix){
            for(int n : row){
                int value = Math.abs(n);
                absSum += value;
                if(value < absSmall) absSmall = value;
                if(n < 0) negCount++;
            }
        }

        if(negCount%2 == 0){
            return absSum;
        } 
        else {
            return absSum - (2L*absSmall);
        }
    }
}