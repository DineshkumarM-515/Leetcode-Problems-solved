class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] arr = words[i].toCharArray();
            for(char c:arr){
                if(c==x){ 
                    li.add(i); 
                    break;
                }
            }
        }
        
        return li;
    }
}
