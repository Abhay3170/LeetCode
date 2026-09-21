class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[]=new int[3];
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)arr[0]++;
            else if(bills[i]==10){
                arr[0]--;
                if(arr[0]<0)return false;
                arr[1]++;
            }
            else{
                if(arr[1]>0 && arr[0]>0){
                    arr[1]--;
                    arr[0]--;
                    arr[2]++;
                }
                else if(arr[0]>=3){
                    arr[0]=arr[0]-3;
                    arr[2]++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}