class Solution {
    int getMax1(String ans, int k, char target){
        int left = 0;
        int count = 0;
        int maxSize = 0;

        for(int right = 0;right < ans.length();right++){
            if(ans.charAt(right) != target){
                count++;
            }

            while(count > k){
                if(ans.charAt(left) != target){
                    count--;
                }
                left++;
            }

            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }

    int getMax2(String ans, int k, char target){
        int left = 0;
        int count = 0;
        int maxSize = 0;

        for(int right = 0;right < ans.length();right++){
            if(ans.charAt(right) != target){
                count++;
            }

            while(count > k){
                if(ans.charAt(left) != target){
                    count--;
                }
                left++;
            }

            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }


    public int maxConsecutiveAnswers(String answerKey, int k) {
        int possibleT = getMax1(answerKey, k, 'T');
        int possibleF = getMax2(answerKey, k, 'F');

        return Math.max(possibleT, possibleF);
    }
}