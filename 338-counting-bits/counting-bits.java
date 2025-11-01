class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            int count =0;
            for(char c:binary.toCharArray()){
                if(c == '1') count ++;
            }
            arr[i] = count;
        }

        return arr;
    
    }
}