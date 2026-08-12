class Solution {
    public void moveZeroes(int[] nums) {
        int follow = 0;
        for(int front = 0; front < nums.length; front++){
            if(nums[front] != 0){
                int temp = nums[front];
                nums[front] = nums[follow];
                nums[follow] = temp;
                follow++;
            }
        }
    }
}