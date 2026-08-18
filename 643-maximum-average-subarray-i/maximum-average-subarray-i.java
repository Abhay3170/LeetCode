class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double msum=sum;
        for(int i=1;i<nums.length-k+1;i++){
            sum=sum+nums[i+k-1]-nums[i-1];
            msum=Math.max(sum,msum);
        }
        return msum/k;
    }
}