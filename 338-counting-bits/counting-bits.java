class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1;i<=n;i++){
            arr[i] = arr[i/2];
            if(i%2 == 1) arr[i]++;
        }
        return arr;
    
    }
}