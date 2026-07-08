class Solution {
    public long splitArray(int[] nums) {
        long primeSum = 0;
        long compositeSum = 0;

        int n = nums.length;
        boolean[] sieve = new boolean[n];
        if (n > 2){
            Arrays.fill(sieve, true);
            sieve[0] = false;
            sieve[1] = false;

            for (int i = 2; i * i < n; i++) {
                if (sieve[i]) {
                    for (int j = i * i; j < n; j += i) {
                        sieve[j] = false;
                    }
                }
            }
        }
        

        for (int i = 0; i < n; i++) {
            if (i >= 2 && sieve[i]) {
                primeSum += nums[i];
            } else {
                compositeSum += nums[i];
            }
        }
        

        long ans = Math.abs(primeSum - compositeSum);
        return ans;
    }
}