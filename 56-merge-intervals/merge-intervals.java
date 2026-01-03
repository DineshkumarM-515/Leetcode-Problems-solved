class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int[] current = intervals[0];
        List<int[]> overlap = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= current[1]){
                current[1] = Math.max(current[1],intervals[i][1]);  
            }
            else{
                overlap.add(current);
                current = intervals[i];
            }
        }
        overlap.add(current);

        return overlap.toArray(new int[overlap.size()][]);
    }
}