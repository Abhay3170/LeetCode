class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String first = strs[0];
        for (int x = 0; x < first.length(); x++) {
            char c = first.charAt(x);
            for (int i = 1; i < strs.length; i++) {
                if (x == strs[i].length() || strs[i].charAt(x) != c) {
                    return first.substring(0, x);
                }
            }
        }
        
        return first;
    }
}