class Solution {
    public int titleToNumber(String columnTitle) {
        int size = 26;
        int count = 1;
        int result = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            result += ((int)columnTitle.charAt(i) - 'A' + 1) * count;
            count *= size;
        }
        return result;
    }
}