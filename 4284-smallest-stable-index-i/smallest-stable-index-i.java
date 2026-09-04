class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0,min=0;
        int n=nums.length;
        int d=0;
        for(int i=0;i<n;i++){
            max=Integer.MIN_VALUE;min=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--){
                max=Math.max(max,nums[j]);
            }
            for(int l=i;l<n;l++){
                min=Math.min(min,nums[l]);
            }
            d=max-min;
            if(d<=k)return i;
        }
        return -1;
    }
}