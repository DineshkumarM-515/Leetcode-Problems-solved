class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n > m) return findMedianSortedArrays(nums2,nums1);

        int low = 0;
        int high = n;
        while(low <= high){
            int partitionA = (low+high)/2;
            int partitionB = (n+m+1)/2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA-1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : nums1[partitionA];
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB-1];
            int minRightB = (partitionB == m) ? Integer.MAX_VALUE : nums2[partitionB];

            if(maxLeftA <= minRightB && maxLeftB <= minRightA){
                if((n+m)%2 == 0){
                    return(Math.max(maxLeftA,maxLeftB)+Math.min(minRightA,minRightB))/2.0;
                }
                else{
                    return Math.max(maxLeftA,maxLeftB);
                }
            }
            else if(maxLeftA > minRightB){
                high = partitionA-1;
            }
            else{
                low = partitionA+1;
            }
        }
        return 0.0;
    }
}