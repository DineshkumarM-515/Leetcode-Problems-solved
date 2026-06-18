class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int ori = n;
        int[] fact = {1,1,2,6,24,120,720,5040,40320,362880};

        while(n > 0){
            int dig = n % 10;
            sum += fact[dig];
            n /= 10;
        }

        char[] s1 = Integer.toString(ori).toCharArray();
        char[] s2 = Integer.toString(sum).toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }
}