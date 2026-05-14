class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        for(int num:nums){
            if(num > max) max = num;
        }

        int cnt = 0;
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            if(num != max && set.contains(num)) return false;
            if(num == max) cnt++;

            set.add(num);
        }
        
        int len = nums.length;

        return (len == max+1) && (cnt == 2);
    }
}