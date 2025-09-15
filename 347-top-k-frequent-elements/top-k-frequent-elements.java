class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int idx=0;
        for(int i=nums.length;i>=0;i--){
            for(int n : bucket[i]){
                ans[idx++] = n;
                if(idx == k) return ans;
            }
        }

        return ans;

    }
}