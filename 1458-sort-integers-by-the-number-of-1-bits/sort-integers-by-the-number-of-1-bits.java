class Solution {
    public int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<15;i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i:arr){
            int bits = Integer.bitCount(i);
            list.get(bits).add(i);
        }

        int idx = 0;
        for(List<Integer> x : list){
            Collections.sort(x);

            for(int i:x){
                ans[idx++] = i;
            }
        }

        return ans;
    }
}