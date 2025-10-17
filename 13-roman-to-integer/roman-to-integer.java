class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> num = new HashMap<>();
        num.put('I', 1);
        num.put('V', 5);
        num.put('X', 10);
        num.put('L', 50);
        num.put('C', 100);
        num.put('D', 500);
        num.put('M', 1000);

        int number = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentVal = num.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextVal = num.get(s.charAt(i + 1));
                if (currentVal < nextVal)
                    number -= currentVal;
                else
                    number += currentVal;
            } else {
                number += currentVal;
            }
        }

        return number;
    }
}