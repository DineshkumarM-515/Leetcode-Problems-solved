class Solution {
    public int maximumCount(int[] nums) {
        int positiveIntegers = 0;
        int negativeIntegers = 0;
        for(int num:nums){
            if(num < 0) negativeIntegers++;
            if(num > 0) positiveIntegers++;
        }

        return Math.max(positiveIntegers,negativeIntegers);
    }
}