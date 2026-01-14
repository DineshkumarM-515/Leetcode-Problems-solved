class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int limit = n/2;

        Set<Integer> candies = new HashSet<>();
        for(int num:candyType){
            candies.add(num);
        }

        return Math.min(limit,candies.size());
    }
}