class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
                i++;
            }
        }
        int x=0,y=0;
        while(y<nums.length){
            if(nums[y]!=0){
                int temp=nums[x];
                nums[x++]=nums[y];
                nums[y++]=temp;
            }
            else y++;
        }
        return nums;
    }
}