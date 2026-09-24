class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){ 
            int sum=0;
            int digit=nums[i];
            while (digit>0)
            {
                sum=sum+1;
                digit=digit/10;
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
    }
}