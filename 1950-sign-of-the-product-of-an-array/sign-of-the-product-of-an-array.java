class Solution {
    public int arraySign(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)return 0;
            else if(nums[i]>0)nums[i]=1;
            else nums[i]=-1;
        }
        int p=1;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
        }
        return p;
    }
}