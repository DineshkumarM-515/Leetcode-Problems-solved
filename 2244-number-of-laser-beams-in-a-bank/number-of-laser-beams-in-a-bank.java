class Solution {
    public int numberOfBeams(String[] bank) {
        int beams  = 0;
        int previous_count = 0;

        for(int i=0;i<bank.length;i++){
            char[] arr = bank[i].toCharArray();
            int current_count = 0;
            for(char c:arr){
                if(c == '1') current_count++;
            }
            if(current_count > 0){
                beams += current_count* previous_count;
                previous_count = current_count; 
            } 
        }

        return beams;
    }
}