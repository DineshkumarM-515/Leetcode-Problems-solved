class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;  
        int[] ps = new int[n];
        int[] ss = new int[n];
        ps[0] = nums[0];
        ss[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            ps[i] = nums[i]+ps[i-1];
        }
        for(int j=n-2;j>=0;j--){
            ss[j] = nums[j]+ss[j+1];
        }

        for(int k=0;k<n;k++){
            if(ps[k] == ss[k]) return k;
        }

        return -1;
    }
}