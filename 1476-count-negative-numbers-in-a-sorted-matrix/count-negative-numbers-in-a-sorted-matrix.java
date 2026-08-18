class Solution {
    public int countNegatives(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++){
            int s=0,e=grid[i].length;
            while(s<e){
                if(grid[i][s]<0)break;
                s++;
            }
            sum+=e-s;
        }
        return sum;
    }
}