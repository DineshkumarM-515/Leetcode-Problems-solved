class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];

        int k = 0;
        for(int i=0;i<n;i++){
            ans[k++] = nums[i];
        }

        for(int i=0;i<n;i++){
            int num = nums[i];
            int rev = 0;
            while(num != 0){
                int dig = num % 10;
                rev = rev * 10 + dig;
                num /= 10;
            }

            ans[k++] = rev;
        }

        Set<Integer> set = new HashSet<>();
        for(int num : ans){
            set.add(num);
        }

        return set.size();
    }
}