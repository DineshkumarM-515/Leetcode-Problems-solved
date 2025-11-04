class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1 < word1.length() && ptr2 < word2.length()){
            merged += word1.charAt(ptr1++);
            merged += word2.charAt(ptr2++);
        }

        while(ptr1 < word1.length()){
            merged += word1.charAt(ptr1++);
        }

        while(ptr2 < word2.length()){
            merged += word2.charAt(ptr2++);
        }

        return merged;
    }
}