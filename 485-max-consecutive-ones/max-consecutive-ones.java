class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int appearance = 0;
        for(int num:nums){
            if(num == 1) appearance++;
            if(num == 0) appearance = 0;
            count = Math.max(appearance,count);
        }
        return count;
    }
}