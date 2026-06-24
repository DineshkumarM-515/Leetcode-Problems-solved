class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> MaxHeap = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );

        MaxHeap.addAll(map.keySet());

        StringBuilder rslt = new StringBuilder();
        while(!MaxHeap.isEmpty()){
            char curr = MaxHeap.poll();
            int freq = map.get(curr);

            for(int i=0;i<freq;i++){
                rslt.append(curr);
            }
        }

        return rslt.toString();
    }
}