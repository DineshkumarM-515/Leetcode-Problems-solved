class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
       Set<Integer> s1 = new HashSet<>();
       HashMap<Integer,Integer> map= new HashMap<>();
       for(int num:nums1){
            if (s1.add(num)){
             map.put(num,map.getOrDefault(num,0)+1);
            }
       }

       Set<Integer> s2 = new HashSet<>();
       for(int num:nums2){
            if(s2.add(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
       }

       Set<Integer> s3 = new HashSet<>();
       for(int num:nums3){
        if(s3.add(num)){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       }
       
       List<Integer> li = new ArrayList<>();
       for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >= 2) li.add(e.getKey());
       }
        
        return li;
    }
}