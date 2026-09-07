class Solution {
    public int maximumCount(int[] nums) {
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)continue;
            if(nums[i]>0)e++;
            else o++;
        }
        return Math.max(e,o);
    }
}