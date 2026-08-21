class Solution {
    public int[][] generateMatrix(int n) {
        int x=1;
        int rs=0,re=n-1,cs=0,ce=n-1;
        int arr[][]=new int[n][n];
        while(rs<=re && cs<=ce){
            for(int i=cs;i<=ce;i++){
                arr[rs][i]=x++;
            }
            rs++;
            for(int i=rs;i<=re;i++){
                arr[i][ce]=x++;
            }
            ce--;
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    arr[re][i]=x++;
                }
                re--;
            }
            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                    arr[i][cs]=x++;
                }
                cs++;
            }
        }
        return arr;
    }
}