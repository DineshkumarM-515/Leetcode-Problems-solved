class Solution {
    public boolean isPossible(int[] arr,int day,int m,int k){
        int cnt = 0;
        int bouquetCnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day){
                cnt++;
            }
            else{
                bouquetCnt += (cnt/k);
                cnt = 0;
            }
        }
        bouquetCnt += (cnt/k);
        return bouquetCnt >= m; 
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = m*1l * k*1l;
        if(val > n) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:bloomDay){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        int low = min;
        int high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(bloomDay,mid,m,k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}