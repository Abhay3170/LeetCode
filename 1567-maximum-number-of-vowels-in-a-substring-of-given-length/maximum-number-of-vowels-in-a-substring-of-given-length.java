class Solution {
    public int maxVowels(String s, int k) {
        int c=0,m=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i)))c++;
        }
        m=Math.max(c,m);
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i)))c++;
            if(isvowel(s.charAt(i-k)))c--;
            m=Math.max(m,c);
        }
        return m;
    }
    public static boolean isvowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
        return false;
    }
}