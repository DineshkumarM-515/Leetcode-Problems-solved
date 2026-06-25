class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if((mid == 0 || nums[mid-1] != nums[mid]) && (mid == nums.length -1 || nums[mid+1] != nums[mid])){
                return nums[mid];
            }
            else if(mid > 0 && nums[mid-1] == nums[mid] && ((mid) % 2 == 0)){
                right = mid-1;
            }
            else if(mid > 0 && nums[mid-1] == nums[mid] && ((mid) % 2 != 0)){
                left = mid+1;
            }
            else if(mid < nums.length-1 && nums[mid+1] == nums[mid] && ((mid) % 2 == 0)){
                left = mid +1;
            }
            else if(mid < nums.length-1 && nums[mid+1] == nums[mid] && ((mid) % 2 != 0)){
                right = mid -1;
            }
        }

        return nums[left];
    }
}