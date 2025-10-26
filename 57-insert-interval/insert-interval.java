class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> rslt = new ArrayList<>();
        int i=0;
        int n=intervals.length;
        
        while(i<n && intervals[i][1] < newInterval[0]){
            rslt.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
            i++;
        }
        rslt.add(newInterval);

        while(i<n){
            rslt.add(intervals[i]);
            i++;
        }

        return rslt.toArray(new int[rslt.size()][]);
    }
}