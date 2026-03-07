class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> idx = new ArrayList<>();
        char[] pat = p.toCharArray();
        Arrays.sort(pat);
        int k = p.length();
        for(int i=0;i<=s.length()-k;i++){
            String str = s.substring(i,i+k);
            char[] subs = str.toCharArray();
            Arrays.sort(subs);
            if(Arrays.equals(pat,subs)){
                idx.add(i);
            }
        }
        return idx;
    }
}