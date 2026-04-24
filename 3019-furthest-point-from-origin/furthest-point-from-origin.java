class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int Lcount = 0;
        int Rcount = 0;
        int Dashcnt = 0;
        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c == 'L') Lcount++;
            if(c == 'R') Rcount++;
            if(c == '_') Dashcnt++;
        }

        int diff = Math.abs(Lcount - Rcount);
        return diff + Dashcnt;
    }
}