class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int countVowels = 0;
        int left = 0, right = k;
        for (int i = 0; i < k; ++i) {
            if (isVowel(s.charAt(i))) {
                countVowels++;
            }
        }
        int ans = countVowels;
        while(right < s.length()) {
            if (isVowel(s.charAt(right))) {
                countVowels++;
            }
            if (isVowel(s.charAt(left))) {
                countVowels--;
            }
            right++;
            left++;
            ans = Math.max(ans, countVowels);
        }
        return ans;
    }
}