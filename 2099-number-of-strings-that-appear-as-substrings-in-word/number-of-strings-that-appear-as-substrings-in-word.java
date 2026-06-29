class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt = 0;
        for (String pat : patterns) {
            if (word.contains(pat))
                cnt++;
        }
        return cnt;
    }
}