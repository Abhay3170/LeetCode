class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int s=0;
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                nums[i]*=-1;
                k--;
            }
        }
        Arrays.sort(nums);
        if(k%2!=0){
            nums[0]=-nums[0];
        }
        for(int x:nums){
            s+=x;
        }
        return s;
    }
}