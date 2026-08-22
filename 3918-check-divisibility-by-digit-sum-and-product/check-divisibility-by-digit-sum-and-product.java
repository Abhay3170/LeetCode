class Solution {
    public boolean checkDivisibility(int n) {
        int p=1;
        int s=0;
        int temp=n;
        while(n>0){
            int x=n%10;
            s+=x;
            p*=x;
            n/=10;
        }
        if(temp%(s+p)!=0)return false;
        return true;
    }
}