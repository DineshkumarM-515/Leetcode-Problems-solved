class Solution {
    public int missingNumber(int[] nums) {
        int currentSum =0;
        for(int num:nums){
            currentSum += num;
        }
        int n = nums.length;
        int rangeSum = 0;
        for(int i=1;i<=n;i++){
            rangeSum += i;
        }

        return rangeSum - currentSum;
    }
}