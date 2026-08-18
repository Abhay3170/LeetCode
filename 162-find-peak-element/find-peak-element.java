class Solution {
    public int findPeakElement(int[] nums) {
        int i=0,j=0;
        int max=nums[0];
        for(i=1;i<nums.length;i++){
            if(nums[i]>max){max=nums[i];j=i;}
        }
        return j;
    }
}