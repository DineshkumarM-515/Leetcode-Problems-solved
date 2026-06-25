class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] mat = new int[n][2];

        for(int i=0;i<n;i++){
            mat[i][0] = position[i];
            mat[i][1] = speed[i];
        }

        Arrays.sort(mat, (a,b) -> Integer.compare(a[0] , b[0]));

        double max = 0;
        int count = 0;
        for(int i=n-1;i>=0;i--){
            int pos = mat[i][0];
            int spd = mat[i][1];

            double time = (double) (target - pos) / spd;

            if(time > max){
                count++;
                max = time;
            }
        }

        return count;
    }
}