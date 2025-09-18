class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int no_of_letters = 0;
        int window_letters = 0;
        char[] ch = s.toCharArray();
        for(int i=0;i<k;i++){
            if(vowels.contains(ch[i])) window_letters++;
        }
        no_of_letters = window_letters;
        
        for(int i=k;i<ch.length;i++){
            if(vowels.contains(ch[i-k])) window_letters--;
            if(vowels.contains(ch[i])) window_letters++;
            no_of_letters = Math.max(no_of_letters , window_letters);
        }
        return no_of_letters;
    }
}