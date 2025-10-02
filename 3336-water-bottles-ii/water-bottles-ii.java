class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk_bottles = numBottles;
        int empty_bottles = numBottles;
        while(empty_bottles >= numExchange){
            empty_bottles -= numExchange;
            drunk_bottles++;
            numExchange++;
            empty_bottles++;
        }

        return drunk_bottles;
    }
}