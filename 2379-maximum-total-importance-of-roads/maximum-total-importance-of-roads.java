class Solution {
    public long maximumImportance(int n, int[][] roads) {
        Map<Integer,Integer> map = new HashMap<>();
        int n2 = roads.length;
        for(int i=0;i<n2;i++){
            int c1 = roads[i][0];
            int c2 = roads[i][1];

            map.put(c1, map.getOrDefault(c1,0) + 1);
            map.put(c2, map.getOrDefault(c2,0) + 1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(
            (a,b) -> map.getOrDefault(b,0) - map.getOrDefault(a,0)
        );

        for(int i=0;i<n;i++){
            q.offer(i);
        }

        long maxImportance = 0;
        int currentImportance = n;
        while(!q.isEmpty()){
            int city = q.poll();
            maxImportance += (long) map.getOrDefault(city,0) * currentImportance;
            currentImportance--;
        }

        return maxImportance;
    }
}