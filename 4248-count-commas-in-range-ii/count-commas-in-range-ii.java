class Solution {
    public long countCommas(long n) {
        long totalCnt = 0;
        long Limit = 1000;

        while(Limit <= n){
            totalCnt += (n-Limit+1);

            Limit *= 1000;
        }

        return totalCnt;
    }
}