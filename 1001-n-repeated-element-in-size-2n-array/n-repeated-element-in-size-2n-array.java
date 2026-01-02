class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return num;
            if(!set.contains(num)) set.add(num);
        }

        return -1;
    }
}