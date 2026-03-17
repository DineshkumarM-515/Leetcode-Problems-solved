class Solution {
    public String reverse(String word){
        String rev = "";
        int end = word.length()-1;
        while(end >= 0){
            rev += word.charAt(end--);
        }
        return rev;
    }
    
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        String reversed = "";
        for(int i=0;i<word.length;i++){
            reversed += reverse(word[i]);
            if(i != word.length-1) reversed += " ";
        }
        return reversed;
    }
}