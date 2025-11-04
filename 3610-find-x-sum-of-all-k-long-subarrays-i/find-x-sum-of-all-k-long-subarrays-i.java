class Solution {
    public int calculatesumofSub(int[] nums,int st,int end,int x){
        int[] freq = new int[50+1];
        int distinctcount =0;
        int total = 0;
        for(int i=st;i<end;i++){
            int num = nums[i];
            total += num;
            if(freq[num] == 0) distinctcount++;
            freq[num]++;
        }

        if(distinctcount < x) return total;

        int resultsum =0;
        for(int select = 0;select < x;select++){
            int bestnum = -1;
            int bestfreq = -1;

            for(int num=50;num >=1;num--){
                if(freq[num] > bestfreq){
                    bestfreq = freq[num];
                    bestnum = num;
                }
            }

            if(bestnum != -1){
                resultsum += bestnum * bestfreq;
                freq[bestnum] = 0;
            }
        }

        return resultsum;
    }
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n-k+1];

        for(int i=0;i<result.length;i++){
            result[i] = calculatesumofSub(nums,i,i+k,x);
        }

        return result;
        
    }
}