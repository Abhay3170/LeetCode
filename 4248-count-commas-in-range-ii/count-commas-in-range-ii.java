class Solution {
    public long countCommas(long n) {
        long commas=0;
        long t=1000;
        while(n>=t){
            commas+=(n-t+1);
            if(t>Long.MAX_VALUE/1000)break;
            t*=1000;
        }
        return commas;
    }
}