class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> check = new ArrayList<>();
        check.add('a');check.add('e');check.add('i');check.add('o');check.add('u');
        check.add('A');check.add('E');check.add('I');check.add('O');check.add('U');
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(check.contains(c)){
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        int k=0;
        String sol = "";
        for(int i=0;i<s.length();i++){
            if(check.contains(s.charAt(i))){
                sol += vowels.get(k++);
            }
            else{
                sol+= s.charAt(i);
            }
        }
        return sol;
    }
}