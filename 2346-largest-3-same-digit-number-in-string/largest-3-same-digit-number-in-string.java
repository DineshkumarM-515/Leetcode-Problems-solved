class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                if(ans == "" || ans != "" && ans.charAt(0) < num.charAt(i)){
                    if(ans != "") ans = "";
                    ans += num.charAt(i);
                    ans += num.charAt(i+1);
                    ans += num.charAt(i+2);
                }
            }
        }
        return ans;
    }
}