class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        

        int maxfreq = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int frequency = entry.getValue();
            if(frequency > maxfreq){
                maxfreq = frequency;
            }
        }

        int count = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int value = entry.getValue();
            if(value == maxfreq) count += value;
        }

        return count;
    }
}