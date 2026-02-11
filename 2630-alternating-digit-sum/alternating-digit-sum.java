class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            sum += sign * (c-'0');
            sign *= -1;
        }
        return sum;
    }
}