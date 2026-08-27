class Solution {
    public int pivotInteger(int n) {
        int lsum=0;
        for(int i=1;i<=n;i++)lsum+=i;
        int rsum=0;
        for(int i=n;i>=0;i--){
            rsum+=i;
            if(lsum==rsum)return i;
            lsum-=i;
        }
        return -1;
    }
}