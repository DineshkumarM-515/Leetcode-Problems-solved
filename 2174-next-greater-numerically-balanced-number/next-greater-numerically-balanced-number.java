class Solution {
    public boolean Greaternumerical(int n){
        int[] count = new int[10];
        int temp = n;
        while(temp > 0){
            int dig = temp%10;
            count[dig]++;
            temp /= 10;
        }

        for(int j = 0;j<10;j++){
            if(count[j] > 0){
                if(count[j] != j) return false;
            }
        }

        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int i = n+1 ; ; i++){
            if(Greaternumerical(i)) return i;
        }
    }
}