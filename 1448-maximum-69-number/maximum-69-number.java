class Solution {
    public int maximum69Number (int num) {
        int ans = 0;
        boolean isChanged = false;
        long power = 1;
        int val = num;

        while(val / power > 9){
            power *= 10;
        }
        
        int dig = 0;
        while(power > 0){
            dig = (int) (val / power);
            if(dig == 6 && !isChanged){
                ans = ans * 10 + 9;
                isChanged = true;
            }
            else{
                ans = ans * 10 + dig;
            }
            val %= power;
            power /= 10;
        }
        return ans;
    }
}