class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n1 = word1.length;
        int n2 = word2.length;
        for(int i=0;i<n1;i++){
            sb1.append(word1[i]);
        }
        
        for(int j=0;j<n2;j++){
            sb2.append(word2[j]);
        }

        if(sb1.length() != sb2.length()) return false;
        for(int i=0;i<sb1.length();i++){
            if(sb1.charAt(i) != sb2.charAt(i)){
                return false;
            }
        }

        return true;
    }
}