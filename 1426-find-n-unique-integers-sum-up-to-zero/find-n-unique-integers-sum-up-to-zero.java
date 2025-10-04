class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2 == 0){
            int k=0;
            for(int i=1;i<=n/2;i++){
                arr[k++] = i;
                arr[k++] = -i;
            }
        }
        else{
            int k=0;
            arr[k++] = 0;
            for(int i=1;i<=n/2;i++){
                arr[k++] = i;
                arr[k++] = -i;
            }
        }

        return arr;
    }
}