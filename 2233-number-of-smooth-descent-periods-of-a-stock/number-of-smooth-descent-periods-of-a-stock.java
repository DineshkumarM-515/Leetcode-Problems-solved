class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long total = 1;
        long window = 1;
        for(int right = 1; right < n; right++){

            if(right > 0 && prices[right] == prices[right-1]-1){
                window++;
            }
            else{
                window = 1;
            }

            total += window;
            
        }

        return total;
    }
}