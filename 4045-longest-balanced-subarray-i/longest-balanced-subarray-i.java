class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int len = 0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer> oddMap = new HashMap<>();
            Map<Integer,Integer> evenMap = new HashMap<>();
            int distinctOdd = 0;
            int distinctEven = 0;
            for(int j=i;j<n;j++){
                if(nums[j]%2 == 0){
                    evenMap.put(nums[j],evenMap.getOrDefault(nums[j],0)+1);
                    if(evenMap.get(nums[j]) == 1){
                        distinctEven++;
                    }
                }else{
                    oddMap.put(nums[j],oddMap.getOrDefault(nums[j],0)+1);
                    if(oddMap.get(nums[j])==1){
                        distinctOdd++;
                    }
                }
                if(distinctOdd == distinctEven){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}