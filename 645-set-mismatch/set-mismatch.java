class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int rangeSum = n*(n+1)/2;

        int dup = 0;
        int currSum = 0;
        for(int i=0;i<n;i++){
            if(i < n-1 && nums[i] == nums[i+1]) dup = nums[i];
            currSum += nums[i];
        }

        int missing = dup - (currSum - rangeSum);

        return new int[]{dup,missing};
    }
}