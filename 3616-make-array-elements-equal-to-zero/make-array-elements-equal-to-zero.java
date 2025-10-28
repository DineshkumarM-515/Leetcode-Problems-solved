class Solution {
    public int countValidSelections(int[] nums) {
        int total =0;
        for(int num:nums){
            total += num;
        }

        int count =0;
        int leftsum =0;
        for(int num:nums){
            if(num != 0) leftsum += num;
            else{
                if(2*leftsum == total) count+=2;
                else if(Math.abs(2*leftsum - total) == 1) count++;
            }
        }

        return count;
    }
}