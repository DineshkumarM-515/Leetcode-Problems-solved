class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elems = new HashSet<>();
        int sequencelen = 0;

        for(int num:nums) elems.add(num);

        for(int num:elems){
            if(elems.contains(num-1)) continue;
            
                int currentlen = 1;
                int currentnum = num+1;
                while(elems.contains(currentnum)){
                    currentlen++;
                    currentnum++;
                }

                sequencelen = Math.max(sequencelen,currentlen);
        }
        return sequencelen; 
    }
}