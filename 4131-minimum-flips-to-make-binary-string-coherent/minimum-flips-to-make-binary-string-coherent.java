class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int ones = 0;
        int zeros = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '0') zeros++;
            else ones++;
        }

        int ans = n;
        // if all 0's (or) all 1's.
        ans = Math.min(ones,zeros);

        //If exactly one 1
        ans = Math.min(ans, Math.abs(ones - 1));

        //To achieve 1.............1 format
        if(n > 1){
            int cost = 0;
            if(s.charAt(0) == '0') cost++;
            if(s.charAt(n-1) == '0') cost++;

            for(int i=1;i<n-1;i++){
                if(s.charAt(i) == '1') cost++;
            }

            ans = Math.min(ans, cost);
        }

        return ans;
    }
}