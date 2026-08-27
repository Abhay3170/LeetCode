class Solution {
    public int thirdMax(int[] nums) {
        long l=0,sl=0,tl=0;
        if(nums.length==1)return nums[0];
        if(nums[0]>nums[1]){
            l=nums[0];
            sl=nums[1];
        }
        else if(nums[0]<nums[1]){
            l=nums[1];
            sl=nums[0];
        }
        else{
            l=nums[0];
            sl=Long.MIN_VALUE;
        }
        tl=Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>l){
                tl=sl;
                sl=l;
                l=nums[i];
            }
            else if(nums[i]>sl && nums[i]!=l){
                tl=sl;
                sl=nums[i];
            }
            else if(nums[i]>tl && nums[i]!=sl && nums[i]!=l){
                tl=nums[i];
            }
        }
        if(tl==Long.MIN_VALUE)return (int)(l);
        return (int)(tl);
    }
}