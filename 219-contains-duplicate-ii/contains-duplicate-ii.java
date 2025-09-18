class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                int idx2 = freq.get(nums[i]);
                if(Math.abs(i - idx2) <= k) return true;
            }
            freq.put(nums[i],i);
        }

        return false;

    }
}