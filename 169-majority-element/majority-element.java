class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int majority = 0;
        for(Map.Entry<Integer,Integer> e : freq.entrySet()){
            if(e.getValue() > (n/2)) majority = e.getKey();
        }

        return majority;
    }
}