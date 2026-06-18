class Solution {
    public int fact(int n){
        int fact = 1;
        while(n > 0){
            fact *= n;
            n--;
        }

        return fact;
    }

    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int ori = n;
        while(n > 0){
            int dig = n % 10;
            sum += fact(dig);
            n /= 10;
        }

        char[] s1 = Integer.toString(ori).toCharArray();
        char[] s2 = Integer.toString(sum).toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }
}