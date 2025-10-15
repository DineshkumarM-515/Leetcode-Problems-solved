class Solution {
    public String rev(String s){
        int st = 0;
        int end = s.length()-1;
        char[] c = s.toCharArray();
        while(st < end){
            char temp = c[st];
            c[st] = c[end];
            c[end] = temp;
            st++;
            end--;
        }
        return new String(c);
    }
    public String reverseWords(String s) {
        String[] st = s.split(" ");
        for(int i=0;i<st.length;i++){
            st[i] = rev(st[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.length;i++){
            if(i != st.length-1){
                sb.append(st[i]);
                sb.append(" ");
            }
            else{
                sb.append(st[i]);
            }
        }
        return sb.toString();
    }
}