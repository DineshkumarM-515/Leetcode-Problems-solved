class Solution {
    public String decodeString(String s) {
        Stack<Character> decode = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != ']'){
                decode.push(c);
            }
            else{
                StringBuilder substr = new StringBuilder();
                while(!decode.isEmpty() && decode.peek() != '['){
                    substr.insert(0,decode.pop());
                } 

                decode.pop();

                StringBuilder num = new StringBuilder();
                String subst = substr.toString();
                while(!decode.isEmpty() && Character.isDigit(decode.peek())){
                    num.insert(0,decode.pop());
                }

                int times = Integer.parseInt(num.toString());
                StringBuilder repeated = new StringBuilder();
                for(int i=0;i<times;i++){
                    repeated.insert(0,subst);
                }

                String repeatedStr = repeated.toString();
                for(char ch : repeatedStr.toCharArray()){
                    decode.push(ch);
                }

            }
        }

        StringBuilder ans = new StringBuilder();
        while(!decode.isEmpty()){
            ans.insert(0,decode.pop());
        }

        return ans.toString();
    }
}