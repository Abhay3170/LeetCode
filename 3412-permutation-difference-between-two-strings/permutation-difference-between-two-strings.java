class Solution {
    public int findPermutationDifference(String s, String t) {
        int d=0;
        for(int i=0;i<s.length();i++){
            int n=t.indexOf(s.charAt(i));
                d+=Math.abs(i-n);
            }
        return d;
    }
}