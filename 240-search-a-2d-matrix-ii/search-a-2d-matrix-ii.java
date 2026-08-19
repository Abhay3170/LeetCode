class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ro=matrix.length;
        int co=matrix[0].length;
        int r=0,c=co-1;
        while(r<ro && c>=0){
            if(matrix[r][c]==target)return true;
            else if(matrix[r][c]<target)r++;
            else c--;
        }
        return false;
    }
}