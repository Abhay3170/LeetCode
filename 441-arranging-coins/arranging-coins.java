class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            n-=i;
            if(n<=i){
                return i;
            }
            i++;
        }
        return i;
    }
}