class Solution {
    public void rotate(int[] nums, int k) {
        int n=  nums.length;
        k = k%n;
        if(n == 1) return;
        int[] rotated = new int[n];
        int l=0;
        for(int i=n-k;i<nums.length;i++){
            rotated[l++] = nums[i];
        }

        for(int i=0;i<n-k;i++){
            rotated[l++] = nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = rotated[i];
        }
    }
}