class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int s=0,e=image[0].length-1;
            while(s<e){
                int temp=image[i][s];
                image[i][s]=image[i][e];
                image[i][e]=temp;
                s++;e--;
            }
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==0)image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}