class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double Maxavg = 0;
        double windowsum = 0;
        for(int i=0;i<k;i++) windowsum += nums[i];
        Maxavg = ((windowsum)/k);

        for(int i=k;i<n;i++){
            windowsum += nums[i] - nums[i-k];
            double avg = windowsum / k ; 
            Maxavg = Math.max(Maxavg,avg); 
        }

        return Maxavg;
    }
}