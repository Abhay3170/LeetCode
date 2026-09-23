class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i+k<=s.length();i++){
            String s1=s.substring(i,i+k);
            int n=Integer.parseInt(s1);
            if(n==0)continue;
            if(num%n==0)c++;
        }
        return c;
    }
}