class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i=1;i<=60;i++){
            long num = (long)num1- (long)i*num2;
            long ori = num;
            if(num < 0) break;
            int count=0;
            while(num != 0){
                if((num&1)==1) count++;
                num = num >> 1;
            }
            if(count <= i && i<=ori) return i;
        }

        return -1;
    }
}