class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long sum = 0;
        int decrement = 0;
        for(int i=n-1;i>=n-k;i--){
            long val = happiness[i] - decrement;
            if(val >= 0){
                sum += val;
            }
            decrement++;
        }
        return sum;
    }
}