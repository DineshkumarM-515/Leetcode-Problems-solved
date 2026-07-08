class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            int i = 0;
            int j = 0;
            while (i < query.length()) {
                char ch = query.charAt(i);
                if (j < pattern.length() && ch == pattern.charAt(j)) {
                    i++;
                    j++;
                } else if (ch >= 'a' && ch <= 'z') {
                    i++;
                } else {
                    break;
                }
            }
            ans.add(i == query.length() && j == pattern.length());
        }
        return ans;
    }
}