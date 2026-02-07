class Solution {
    public long findSpeed(int[] arr,int speed){
        long totalHrs = 0;
        for(int num:arr){
            totalHrs += (long) Math.ceil((double)num/(double)speed);
        }
        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = Integer.MIN_VALUE;
        for(int num:piles){
            if(num > high) high = num;
        }

        int ans = 0;

        while(low <= high){
            int mid = low+(high - low)/2;
            long totalSpeed = findSpeed(piles,mid);
            if(totalSpeed <= h){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}