class Solution {
    public int trap(int[] height) {
        int s=0;
        int l=0,h=height.length-1;
        int lm=0,rm=0;
        while(l<h){
            if(height[l]<=height[h]){
                if(height[l]>lm){
                    lm=height[l];
                }
                else{
                    s+=lm-height[l];
                }
                l++;
            }
            else{
                if(height[h]>rm){
                    rm=height[h];
                }
                else{
                    s+=rm-height[h];
                }
                h--;
            }
        }

        return s;
    }
}