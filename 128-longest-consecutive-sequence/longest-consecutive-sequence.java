class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        int LongestSequence = 0;
        for(int num:set){
            if(set.contains(num-1)) continue;
            int currentSequ = 1;
            int Nextelem = num+1;
            while(set.contains(Nextelem)){
                currentSequ++;
                Nextelem++;
            }

            LongestSequence = Math.max(currentSequ,LongestSequence);
        }

        return LongestSequence;
    }
}