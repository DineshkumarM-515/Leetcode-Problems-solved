class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        String vowels = "";
        for(int i=0;i<str.length;i++){
            char c  = str[i];
            char elem =  Character.toLowerCase(c);
            if(elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u'){
                vowels += c;
                str[i] = '$';
            }
        }

        char[] vowel = vowels.toCharArray();
        int k = vowel.length-1;;
        String ans = "";
        for(int i=0;i<str.length;i++){
            if(str[i] == '$'){
                str[i] = vowel[k--];
            }
        }

        for(char c:str) ans += c;

        return ans;
    }
}