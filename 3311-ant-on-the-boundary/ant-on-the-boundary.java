class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int boundary = 0;
        int count = 0;
        for(int num:nums){
            boundary += num;
            if(boundary == 0) count += 1;
        }
        return count;
    }
}