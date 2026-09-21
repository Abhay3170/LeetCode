class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')v++;
            else v--;
            if(v==0)c++;
        }
        return c;
    }
}