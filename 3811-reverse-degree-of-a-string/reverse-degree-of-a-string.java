class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            char c=s.charAt(i-1);
            int x=26-(s.charAt(i-1)-'a');
            sum+=x*i;
        }
        return sum;
    }
}