class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char[] ch = s.toCharArray();
        for(char c : ch){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        int maxvowel = 0;
        int maxconsonent = 0;
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();

            if(vowels.contains(key)){
                maxvowel = Math.max(maxvowel,value);
            }
            else{
                maxconsonent = Math.max(maxconsonent,value);
            }
        }

        int output =  maxvowel + maxconsonent;

        return output;
    }
}