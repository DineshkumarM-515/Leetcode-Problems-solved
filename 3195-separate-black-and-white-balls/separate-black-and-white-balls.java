class Solution {
    public long minimumSteps(String s) {
        int n = s.length();

        long count = 0;
        char[] nums = s.toCharArray();
        long ans = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i] == '0') ans++;
            else{
                count += ans;
            }
        }

        return count;
    }
}