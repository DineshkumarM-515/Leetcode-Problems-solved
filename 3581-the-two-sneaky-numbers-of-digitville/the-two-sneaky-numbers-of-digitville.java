class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) list.add(num);
            else{
                set.add(num);
            }
        }
        int[] sneaky = new int[list.size()];
        int k = 0;
        for(int num:list){
            sneaky[k++] = num;
        }

        return sneaky;
    }
}