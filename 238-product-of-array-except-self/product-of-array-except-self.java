class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;

        int pro1 = 1;
        for(int i=1;i<n;i++){
            pro1 *= nums[i-1];
            prefix[i] = pro1;
        }

        int pro2 = 1;
        for(int i=n-2;i>=0;i--){
            pro2 *= nums[i+1];
            suffix[i] = pro2;
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }

        return ans;
    }
}