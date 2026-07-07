class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int k = 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int i=0;i<n;i++){
            int num = nums[i];
            int rev = 0;
            while(num != 0){
                int dig = num % 10;
                rev = rev * 10 + dig;
                num /= 10;
            }

            set.add(rev);
        }

        return set.size();
    }
}