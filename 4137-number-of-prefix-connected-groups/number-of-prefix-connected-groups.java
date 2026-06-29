class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> freq = new HashMap<>();
        for(String word : words){
            if(word.length() >= k){
                String prefix = word.substring(0,k);
                freq.put(prefix, freq.getOrDefault(prefix,0)+1);
            }
        }

        int grpCnt = 0;
        for(Map.Entry<String,Integer> e : freq.entrySet()){
            if(e.getValue() > 1){
                grpCnt++;
            }
        }

        return grpCnt;
    }
}