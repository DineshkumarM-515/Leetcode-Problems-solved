class Solution {
    public int longestPalindrome(String[] words) {
        int n = words.length;
        int ans = 0;
        Map <String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String st = words[i];
            String rev = "";
            rev += st.charAt(1);
            rev += st.charAt(0);
            if(map.containsKey(rev)){
                ans += 4;
                map.put(rev, map.get(rev)-1);
                if(map.get(rev)== 0){
                    map.remove(rev);
                }
            }
            else{
                map.put(st,map.getOrDefault(st,0)+1);
            }
        }
        for(String key : map.keySet()){
            if(key.charAt(0)==key.charAt(1)){
                ans+=2;
                break;
            }
        }
        return ans;
    }
}