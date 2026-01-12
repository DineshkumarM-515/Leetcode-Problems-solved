class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int Mintime = 0;
        for(int i=0;i<n-1;i++){
            int[] current = points[i];
            int[] nextElem = points[i+1];

            int x1 = current[0];
            int x2 = current[1];
            int y1 = nextElem[0];
            int y2 = nextElem[1];
            
            int sub1 = Math.abs(y1-x1);
            int sub2 = Math.abs(y2-x2);
            Mintime += Math.max(sub1,sub2);
        }

        return Mintime;
    }
}