class Solution {
    public boolean isNotzero(int num){
        while(num != 0){
            int dig = num%10;
            if(dig == 0) return false;
            num /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int b = n-a;
            if(isNotzero(a) && isNotzero(b)) return new int[]{a,b};
        }
        return new int[]{};
    }
}