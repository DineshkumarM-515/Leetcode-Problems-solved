class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int start = 0;
        int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int end = 0; end < n; end++){
            freq.put(fruits[end], freq.getOrDefault(fruits[end], 0) + 1);
            while(freq.size() > 2){
                freq.put(fruits[start], freq.get(fruits[start])-1);
                if(freq.get(fruits[start]) == 0) {
                    freq.remove(fruits[start]);
                }
                start++;
            }
            ans = Math.max(ans, (end-start)+1);
        }
        return ans;
    }
}