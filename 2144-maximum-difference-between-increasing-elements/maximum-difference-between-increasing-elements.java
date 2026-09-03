class Solution {
    public int maximumDifference(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                d=Math.max(d,nums[j]-nums[i]);
            }
        }
        if(d<1)return -1;
        return d;
    }
}