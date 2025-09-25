class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n == 0) return 0;

        for(int i = n-2 ; i >=0; i--){
            List<Integer> currentrow = triangle.get(i);
            List<Integer> nextrow = triangle.get(i+1);
            for(int j=0;j<=i;j++){
               int minpathsum = Math.min(nextrow.get(j) , nextrow.get(j+1))+currentrow.get(j); 
               currentrow.set(j,minpathsum);
            }
        }
        return triangle.get(0).get(0);
    }
}