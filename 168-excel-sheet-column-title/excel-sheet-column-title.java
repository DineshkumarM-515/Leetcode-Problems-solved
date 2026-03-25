class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder rslt = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            rslt.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return rslt.reverse().toString();
    }
}