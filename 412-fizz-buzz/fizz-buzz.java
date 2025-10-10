class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ansstr = "";
            if(i%3==0) ansstr += "Fizz";
            if(i%5==0) ansstr += "Buzz";
            if(ansstr.length() == 0) ansstr += i;
            ans.add(ansstr);
        }
        return ans;
    }
}