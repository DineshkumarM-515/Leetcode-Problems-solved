class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> digs = new ArrayList<>();
        for(int num: nums){
            String st = String.valueOf(num);
            String[] dig = st.split("");
            for(String d : dig){
                int val = Integer.parseInt(d);
                digs.add(val);
            }
        }

        int[] arr = new int[digs.size()];
        int k = 0;

        for(int num:digs){
            arr[k++] = num;
        }

        return arr;
    }
}