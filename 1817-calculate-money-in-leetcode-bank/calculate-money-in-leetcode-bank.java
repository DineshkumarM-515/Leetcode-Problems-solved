class Solution {
    public int totalMoney(int n){
        int sum =0;
        int currentdeposit = 1;
        int mondaysdeposit = 1;
        for(int i=1;i<=n;i++){
            sum += currentdeposit;
            currentdeposit++;

            if(i%7 == 0){
                mondaysdeposit++;
                currentdeposit = mondaysdeposit;
            }
            
        }
        return sum;
    }
}