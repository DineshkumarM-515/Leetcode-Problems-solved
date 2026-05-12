class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                int height = heights[st.pop()];
                int left = (st.isEmpty()) ? -1 : st.peek();
                int width = i - left - 1;

                maxArea = Math.max(maxArea, height*width);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int height = heights[st.pop()];
            int left = (st.isEmpty()) ? -1 : st.peek();
            int width = n - left - 1;

            maxArea = Math.max(maxArea, height*width);
        }

        return maxArea;
    }
}