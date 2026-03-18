class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int temp1 = 0;
        int temp2 = n;
        int k = 0;
        for(int i=0;i<n;i++){
            ans[k++] = nums[temp1++];
            ans[k++] = nums[temp2++];
        }
        return ans;
    }
}