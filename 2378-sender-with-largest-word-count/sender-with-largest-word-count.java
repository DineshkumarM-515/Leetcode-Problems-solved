class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap<String, Integer> map = new TreeMap<>();
        int n = messages.length;
        for(int i=0;i<n;i++){
            String[] words = messages[i].split(" ");
            int len = words.length;
            if(!map.containsKey(senders[i])){
                map.put(senders[i] , len);
            }
            else{
                map.put(senders[i], map.get(senders[i])+len);
            }
        }

        System.out.println(map);

        String ans = map.firstKey();
        int cnt = map.get(ans);
        for(Map.Entry<String,Integer> e : map.entrySet()){
            String str = e.getKey();
            int f = e.getValue();
            if(cnt == f && ans.compareTo(str) < 0){
                ans = str;
            }
            else if(f > cnt){
                ans = str;
                cnt = f;
            }
        }

        return ans;
    }
}