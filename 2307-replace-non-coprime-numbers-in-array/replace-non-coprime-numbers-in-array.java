class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b); 
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for(int num:nums){
            stack.add(num);

            while(stack.size() > 1){
                int last = stack.get(stack.size()-1);
                int secondlast = stack.get(stack.size()-2);
                int gcd = gcd(last,secondlast);
                if(gcd == 1) break;
                stack.remove(stack.size()-1);
                int lcmval = (int)((long) last*secondlast / gcd);
                stack.set(stack.size()-1,lcmval);
            }
        }
        return stack;
    }
}