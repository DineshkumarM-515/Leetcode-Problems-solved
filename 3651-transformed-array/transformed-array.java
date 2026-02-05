class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] transformed = new int[n];
        for(int i=0;i<nums.length;i++){
            int idx = (i+nums[i])%n;
            if(idx < 0){
                idx += n;
            }
            transformed[i] = nums[idx];
        }
        return transformed;
    }
}