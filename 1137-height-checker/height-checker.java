class Solution {
    public int heightChecker(int[] heights) {
        int height[]=new int[heights.length];
        for(int i=0;i<height.length;i++){
            height[i]=heights[i];
        }
        Arrays.sort(height);
        int c=0;
        for(int i=0;i<height.length;i++){
            if(height[i]!=heights[i])c++;
        }
        return c;
    }
}