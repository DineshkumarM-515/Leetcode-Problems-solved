class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        int area = Integer.MIN_VALUE;
        while(start < end){
           if(height[start] < height[end]){
            int a = height[start] *(end-start);
            if(a > area) area = a;
            start++;
           }
           else{
            int a = height[end] *(end - start);
            if(a > area) area = a;
            end--;
           }
        }   
        return area;
    }
}