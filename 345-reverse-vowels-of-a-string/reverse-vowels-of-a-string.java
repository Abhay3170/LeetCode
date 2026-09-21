class Solution {
    public String reverseVowels(String s) {
        boolean[] isVowels = new boolean[128];
        for(char c : "aeiouAEIOU".toCharArray()){
            isVowels[c] = true;
        }

        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (!isVowels[chars[start]]) {
                start++;
                continue;
            }
            if (!isVowels[chars[end]]) {
                end--;
                continue;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}