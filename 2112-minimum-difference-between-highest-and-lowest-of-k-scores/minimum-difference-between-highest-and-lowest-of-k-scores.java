class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums); //1,4,7,9
        int n = nums.length;
        int diff = nums[k-1]-nums[0];
        for(int i=1;i+k<=n;i++){
            diff = Math.min(diff,nums[i+k-1]-nums[i]);
        }
        return diff;
    }
}