class Solution {
    public int findPairs(int[] arr,int mid,int n){
        int count = 0;
        int j=0;
        for(int i=1;i<n;i++){
            while(arr[i]-arr[j] > mid) j++;
            count+= i-j;
        }
        return count;
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int right = nums[n-1]-nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1] < left) left = nums[i]-nums[i-1];
        }

        while(left < right){
            int mid = left+(right-left)/2;
            if(findPairs(nums,mid,n) >= k){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}