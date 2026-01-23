class Solution {
    public int hammingDistance(int x, int y) {
        int num = x^y;
        int hammingDistance = 0;
        for(int i=31;i>=0;i--){
            hammingDistance += ((num>>i)&1)==1 ? 1:0;
        }
        return hammingDistance;
    }
}