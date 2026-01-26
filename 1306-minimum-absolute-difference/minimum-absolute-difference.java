class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<List<Integer>> minabs = new ArrayList<>();
        int min = Math.abs(arr[0]-arr[1]);
        for(int i=0;i<n-1;i++){
            int diff  =  Math.abs(arr[i]-arr[i+1]);
            min = diff < min ? diff : min;
        }
        for(int i=0;i<n-1;i++){
            int diff  =  Math.abs(arr[i]-arr[i+1]);
            if(diff == min){
                List<Integer> li = new ArrayList<>();
                li.add(arr[i]);
                li.add(arr[i+1]);
                minabs.add(li);
            }
        }
        return minabs;
    }
}