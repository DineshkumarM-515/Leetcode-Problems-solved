class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0 || k == 1) return 0;
      int n = nums.length;
      int start = 0;
      int product = 1;
      int count = 0;
      for(int end=0;end<n;end++){
        product *= nums[end];
        while(product >= k){
            product /= nums[start];
            start++;
        }
        count += (end-start)+1; 
      }  
      return count;
    }
}