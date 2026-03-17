class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCnt = 0;
        int n = word.length();
        for(int i = 0 ; i < n ; i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)) capitalCnt++;
        }

        if(capitalCnt == n || capitalCnt == 0) return true;
        if((capitalCnt == 1) && (Character.isUpperCase(word.charAt(0)))) return true;
        
        return false;
    }
}