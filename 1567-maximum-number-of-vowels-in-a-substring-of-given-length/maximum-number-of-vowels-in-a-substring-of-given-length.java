class Solution {
    public int maxVowels(String s, int k) {
        int current_letters = 0;
        int window_letters = 0;
        int n = s.length();
        for(int i=0;i<k;i++){
            char c = s.charAt(i);
            int cnt2 = 0;
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                window_letters++;
            }
        }

        current_letters = window_letters;
        for(int i=k;i<n;i++){
            if( s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' || s.charAt(i-k) == 'u') window_letters--;
            
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') window_letters++;

            current_letters = Math.max(current_letters, window_letters);
        }
        
        return current_letters;
    }
}