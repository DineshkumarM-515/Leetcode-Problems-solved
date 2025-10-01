class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total_drunk = 0;
        int full_bottles = numBottles;
        int empty_bottles = 0;
        while(full_bottles > 0 || empty_bottles >= numExchange){
            total_drunk += full_bottles;
            empty_bottles += full_bottles;
            full_bottles=0;
            int new_full = (empty_bottles / numExchange);
            int empty_used = new_full*numExchange;
            empty_bottles -= empty_used;
            full_bottles = new_full; 
        }
        return total_drunk;
    }
}