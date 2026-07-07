class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if(n == 2) return (long) skill[0]*skill[1];

        Arrays.sort(skill);
        int sum = 0;
        for(int num : skill){
            sum += num;
        }

        int grps = n/2;
        int requSum = (sum /grps); 

        int left = 0;
        int right = n-1;

        long sum1 = 0;
        while(left <= right){
            int sum2 = skill[left]+skill[right];
            if(sum2 != requSum) return -1;
            else{
                long multiply = skill[left]*skill[right];
                sum1 += multiply;
            }
            left++;
            right--;
        }
        return sum1;
    }
}