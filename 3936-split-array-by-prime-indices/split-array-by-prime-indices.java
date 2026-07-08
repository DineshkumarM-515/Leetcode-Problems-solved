class Solution {
    public boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public long splitArray(int[] nums) {
        long primeSum = 0;
        long compositeSum = 0;

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (isPrime(i))
                primeSum += nums[i];
            else
                compositeSum += nums[i];
        }

        long ans = Math.abs(primeSum - compositeSum);
        return ans;
    }
}