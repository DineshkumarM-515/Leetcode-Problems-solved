class Solution {
    public double myPow(double x, int n) {
        long exp = n;

        if(n < 0){
            x =  1/x;
            exp = -exp;
        }

        double soln = 1.0;
        while(exp > 0){
            if(exp % 2 == 1) soln *= x;
            x *= x;
            exp /= 2;
        }

        return soln;
    }
}