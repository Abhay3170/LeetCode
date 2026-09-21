class Solution {
    public int dominantIndex(int[] nums) {
        int x=0,mi=0;
        for(int i=0;i<nums.length;i++){
            if(x<nums[i]){x=nums[i];mi=i;}
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x)continue;
            if(nums[i]*2>x)return -1;
        }
        return mi;
    }
}