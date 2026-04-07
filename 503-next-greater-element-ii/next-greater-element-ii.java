class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1;i>=0;i--){
            int val = nums[i%n];
            while(!st.isEmpty() && st.peek() <= val){
                st.pop();
            }

            if(i < n){
                if(!st.isEmpty()){
                    ans[i] = st.peek();
                }
            }
            st.push(val);
        }

        return ans;
    }
}