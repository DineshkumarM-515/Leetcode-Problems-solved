class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int sum = 0;
        for(int num : costs){
            sum += num;
            if(sum > coins) break;
             count++;
        }

        return count;
    }
}