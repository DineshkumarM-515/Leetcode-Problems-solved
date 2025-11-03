class Solution {
    public char findTheDifference(String s, String t) {
        int svalue = 0;
        for(char c : s.toCharArray()){
            int ch = c;
            svalue += ch;
        }

        int tvalue = 0;
        for(char c:t.toCharArray()){
            int ch = c;
            tvalue += ch;
        }

        char c = (char) Math.abs(svalue - tvalue);
        
        return c;
    }
}