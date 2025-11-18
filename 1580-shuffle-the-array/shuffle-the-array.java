class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] arr = new int[len];
        int k = 0;
        for(int i=0;i<len;i+=2){
            arr[i] = nums[k++];
        }

        for(int i=1;i<len;i+=2){
            arr[i] = nums[n++];
        }

        return arr;
    }
}