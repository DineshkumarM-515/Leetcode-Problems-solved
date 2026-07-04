class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String sortVowels(String s) {
        int n = s.length();
       Map<Character,int[]> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                map.putIfAbsent(c, new int[]{0,i});
                map.get(c)[0]++;
            }
        }

        PriorityQueue<Character> q = new PriorityQueue<>((a,b) -> {
            int[] f1 = map.get(a);
            int[] f2 = map.get(b);
            if(f1[0] == f2[0]){
                return f1[1] - f2[1];
            }
            else{
                return f2[0] - f1[0];
            }
        });

        q.addAll(map.keySet());

        List<Character> li = new ArrayList<>();
        while(!q.isEmpty()){
            char ch = q.poll();
            int cnt = map.get(ch)[0];

            for(int i=0;i<cnt;i++){
                li.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                sb.append(li.get(ptr++));
            }
            else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}