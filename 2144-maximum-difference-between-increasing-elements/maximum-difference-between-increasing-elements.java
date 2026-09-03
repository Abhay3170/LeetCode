class Solution {
    public int maximumDifference(int[] nums) {
        int d=-2;
        int max=-1;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                d=nums[i]-min;
            }
            else{
                min=nums[i];
            }
            if(d>max)max=d;
        }
        return max;
    }
}