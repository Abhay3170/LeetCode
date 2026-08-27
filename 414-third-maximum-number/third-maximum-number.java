class Solution {
    public int thirdMax(int[] nums) {
        long l=Long.MIN_VALUE,sl=Long.MIN_VALUE,tl=Long.MIN_VALUE;
        for(int num:nums){
            if(num>l){
                tl=sl;
                sl=l;
                l=num;
            }
            else if(num>sl && num!=l){
                tl=sl;
                sl=num;
            }
            else if(num>tl && num!=sl && num!=l){
                tl=num;
            }
        }
        return tl==Long.MIN_VALUE?(int)l:(int)tl;
    }
}