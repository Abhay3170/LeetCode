class Solution {
    public int[] countBits(int n) {
        if(n==0)return new int[]{0};
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            int x=i;
            int c=0;
            while(x!=0){
                if((x&1)==1)c++;
                x>>=1;
            }
            arr[i]=c;
        }
        return arr;
    }
}