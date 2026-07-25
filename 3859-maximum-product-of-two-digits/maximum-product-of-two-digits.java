class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int secMax =0;

        while(n != 0){
            int dig = n%10;
            if(dig > max){
                secMax = max;
                max = dig;
            }
            else if(dig > secMax){
                secMax = dig;
            }

            n /= 10;
        }

        
        return max*secMax;
    }
}