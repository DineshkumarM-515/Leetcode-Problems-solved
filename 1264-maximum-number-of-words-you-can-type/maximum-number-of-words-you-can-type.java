class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        char[] broken = brokenLetters.toCharArray();
        Set<Character> map = new HashSet<>();
        for(char c:broken){
            map.add(c);
        }
        for(String word:words){
            char[] ch = word.toCharArray();
            int len = ch.length;
            int cnt = 0;
            for(char c:ch){
                if(map.contains(c)) break;
                else cnt++;
            }
            if(cnt == len) count++;
        }
        return count;
    }
}