class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int st = k-1;
        if(st == 0) return true;
        for(int i=k+1;i<nums.size();i++){
            if(nums.get(i) > nums.get(i-1)&& nums.get(i-k)>nums.get(i-k-1)){
                st--;
            }
            else{
                st = k-1;
            }
            if(st == 0 ) return true;
        }

        return false;
    }
}