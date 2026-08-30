class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[max])max=i;
            if(nums[i]<nums[min])min=i;
        }
        int l=Math.min(max,min);
        int r=Math.max(max,min);

        int first=r+1;
        int sec=n-l;
        int thir=(n-r)+(l+1);
        return Math.min(thir,Math.min(first,sec));
    }
}