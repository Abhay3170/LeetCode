class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        int l=1,r=num;
        while(l<=r){
            int m=(l+r)/2;
            long sq=(long)m*m;
            if(sq==num)return true;
            else if(sq>num)r=m-1;
            else l=m+1;
        }
        return false;
    }
}