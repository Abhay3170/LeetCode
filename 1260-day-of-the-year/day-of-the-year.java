class Solution {
    public int dayOfYear(String date) {
        int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String arr[]=date.split("-");
        int year=Integer.parseInt(arr[0]);
        int mo=Integer.parseInt(arr[1]);
        int day=Integer.parseInt(arr[2]);
        if((year%4==0 && year%100!=0) || year%400==0){
            mon[1]+=1;
        }
        int n=0;
        for(int i=0;i<mo-1;i++){
            n+=mon[i];
        }
        return n+day;
    }
}