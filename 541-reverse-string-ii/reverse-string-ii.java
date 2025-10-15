class Solution {
    public void rev(char[] arr,int st,int end){
        while(st < end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i+=2*k){
            int st = i;
            int end = Math.min(i+k-1,n-1);
            rev(ch,st,end);
        }
        return new String(ch);
    }
}