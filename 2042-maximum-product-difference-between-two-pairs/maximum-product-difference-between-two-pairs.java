class Solution {
    public int maxProductDifference(int[] nums) {
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=l){
                sl=l;
                l=nums[i];
            }
            else if(nums[i]>=sl && nums[i]!=l){
                sl=nums[i];
            }
            if(nums[i]<=s){
                ss=s;
                s=nums[i];
            }
            else if(nums[i]<=ss && nums[i]!=s){
                ss=nums[i];
            }
        }
        return l*sl-s*ss;
    }
}