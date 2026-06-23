class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num: tasks){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int Operations = 0;
        for(int fr : freq.values()){
            if(fr < 2) return -1;
            
            int remainder = fr % 3;
            if(remainder == 0){
                Operations += (fr/3);
            }
            else if(remainder == 1 || remainder == 2){
                Operations += (fr/3)+1;
            }
        }

        return Operations;
    }
}