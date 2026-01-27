class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length-1;
        while(right >= 0 && left <= matrix.length-1){
            int current = matrix[left][right];
            if(current == target) return true;
            else if(current > target) right--;
            else if(current < target) left++;
        }
        return false;
    }
}