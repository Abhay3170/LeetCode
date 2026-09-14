class Solution {
    public int reverseBits(int n) {
        int arr[]=new int[32];
        int temp=n;
        int i=0;
        while(temp>0){
            arr[i++]=temp%2;
            temp/=2;
        }
        
        int res=0;
        int j=0;
        while(j<32){
            res=res*2+arr[j++];
        }
        return res;
    }
}