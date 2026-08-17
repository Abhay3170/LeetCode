class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int x=0,y=0,z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                y++;
            }
            else if(nums[i]>pivot){
                z++;
            }
            else{
                x++;
            }
        }
        int i=0,j=x,k=x+y;
        for(int g=0;g<nums.length;g++){
            if(nums[g]==pivot){
                arr[j]=nums[g];
                j++;
            }
            else if(nums[g]>pivot){
                arr[k]=nums[g];
                k++;
            }
            else{
                arr[i]=nums[g];
                i++;
            }
        }
        return arr;
    }
}