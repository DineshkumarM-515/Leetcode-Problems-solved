class Solution {
    public int numOfDays(int[] w,int capacity){
        int days = 1 , totalCap = 0;
        for(int i=0;i<w.length;i++){
            if(totalCap + w[i] > capacity){
                days += 1;
                totalCap = w[i];
            }
            else{
                totalCap += w[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:weights){
            if(num > max) max = num;
            sum += num;
        }

        int left = max;
        int right = sum;
        while(left <= right){
            int mid = left+(right - left)/2;
            int noOfDays = numOfDays(weights,mid);
            if(noOfDays <= days){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}