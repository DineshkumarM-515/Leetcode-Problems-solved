class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;

        int totalSlice = 0;
        int currStreak = 0;
        for(int i=2;i<n;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                currStreak++;
                totalSlice += currStreak;
            }
            else{
                currStreak = 0;
            }
        }

        return totalSlice;

    }
}