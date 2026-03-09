class Solution {
    public String countAndSay(int n) {
        String count = "1";
        for(int i=1;i<n;i++){
            String count2 = "";
            int cnt = 1;
            char ch = count.charAt(0);
            for(int j=1;j<count.length();j++){
                char ch2 = count.charAt(j);
                if(ch2 == ch) cnt++;
                else{
                    count2 += (String.valueOf(cnt)+ch);
                    cnt = 1;
                    ch = ch2;
                }
            }
            count2 += (String.valueOf(cnt)+ch);
            count = count2;
        }
        return count;    
    }
}