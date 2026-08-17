class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0;
        int left=0,right=0;
        int l=Integer.MAX_VALUE;
        while(right<nums.length){
            s+=nums[right];
            while(s>=target){
                l=Math.min(l,right-left+1);
                s-=nums[left];
                left++;
            }
            right++;
        }
        if(l!=Integer.MAX_VALUE){
            return l;
        }
        return 0;
    }
}