class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int Filled = 0;
        int n = rocks.length;
        int[] needed = new int[n];

        for(int i=0;i<n;i++){
            needed[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(needed);

        for(int i=0;i<n;i++){
            if(needed[i] == 0) Filled++;
            else if (additionalRocks >=  needed[i]) { 
                additionalRocks -= needed[i];
                Filled++;
            }
        }

        return Filled;
    }
}