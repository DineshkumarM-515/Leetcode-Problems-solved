class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int maxRobbed = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
          int sum2 = sum+nums[i]; // Rob current(i.e, nums[i-2]+nums[i])
          int sum3 = Math.max(sum, maxRobbed); // max(skip, Rob)
          maxRobbed = sum2; //replace them 
          sum = sum3;
        }
        
        return Math.max(maxRobbed,sum);
    }
}