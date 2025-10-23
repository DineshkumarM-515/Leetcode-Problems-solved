class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length() > 2){
           String st = "";
           for(int i=0;i<s.length()-1;i++){
                int dig1 = s.charAt(i) - '0';
                int dig2 = s.charAt(i+1) - '0';
                int mod1 = (dig1+dig2)%10;
                st += mod1;      
            }
            s = st;
        }
        
        return s.charAt(0) == s.charAt(1);
    }
}