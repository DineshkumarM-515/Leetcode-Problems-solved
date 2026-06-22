class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        for(int i=0;i<n;i++){
            int ptr = 0;

            while(k > 0){
                k -= chalk[ptr++];
                if(k == 0){
                    if(ptr == n) return 0;
                    else return ptr ;
                }
                else if(k<0){
                    return ptr-1;
                }
              // ptr++;

                if(ptr == n) ptr = 0;
            }
        }
        return -1;
    }
}