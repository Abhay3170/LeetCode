class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();

        int si=0,ti=0;
        while(si<sa.length && ti<ta.length){
            if(sa[si]==ta[ti]){
                si++;
                ti++;
            }else{
                ti++;
            }
        }
        return si==sa.length;
    }
}