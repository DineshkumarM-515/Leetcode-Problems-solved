class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int arrlen = nums.length;
        int triangles = 0;
        for(int i = arrlen-1;i>=2;i--){
            int left = 0;
            int right = i-1;

            while(left < right){
                if(nums[left]+nums[right] > nums[i]){
                    triangles += right - left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return triangles;
    }
}