class Solution {
    public boolean doesAliceWin(String s) {
        String check = "aeiou";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(check.indexOf(ch) != -1) return true;
        }
        return false;
    }
}