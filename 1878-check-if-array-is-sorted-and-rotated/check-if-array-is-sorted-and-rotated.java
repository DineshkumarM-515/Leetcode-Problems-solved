class Solution {
    public boolean check(int[] nums) {
        //3 4 5 1 2
        int n = nums.length;
        int rotationcount=0;
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                rotationcount++;
            }
        }
        if(nums[n-1] > nums[0]) rotationcount++;
        
        return (rotationcount > 1) ? false:true;
    }
}