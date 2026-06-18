class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> li = new ArrayList<>();

        for(String st : nums){
            li.add(st);
        }

        StringBuilder sb = new StringBuilder(nums[0]);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == '1'){
                sb.setCharAt(i,'0');
            }
            else{
                sb.setCharAt(i, '1');
            }

            if(!li.contains(sb.toString())) {
                return sb.toString();
            }

        }

        return "";

    }
}