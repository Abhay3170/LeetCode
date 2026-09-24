class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int s=0;
            while(x>0){
                int y=x%10;
                s+=y;
                x/=10;
            }
            if(s==i)return i;
        }
        return -1;
    }
}