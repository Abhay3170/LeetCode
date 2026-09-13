class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        for(int i = 0; i<length; i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(word1.length() > word2.length()){
            ans.append(word1.substring(length , word1.length()));
        }
        if(word2.length() > word1.length()){
            ans.append(word2.substring(length , word2.length()));
        }
        return ans.toString();
    }
}