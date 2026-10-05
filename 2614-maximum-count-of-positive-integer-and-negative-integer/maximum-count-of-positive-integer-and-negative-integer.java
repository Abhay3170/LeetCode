class Solution {
    public int maximumCount(int[] nums) {
        int pos=-1,neg=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=0)high=mid-1;
            else low=mid+1;
        }
        neg=high+1;
        low=0;high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=0)low=mid+1;
            else high=mid-1;
        }
        pos=nums.length-low;
        return Math.max(pos,neg);
    }
}