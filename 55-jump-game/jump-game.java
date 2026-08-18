class Solution {
    public boolean canJump(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i>m)return false;
            m=Math.max(m,nums[i]+i);
        }
        return true;
    }
}