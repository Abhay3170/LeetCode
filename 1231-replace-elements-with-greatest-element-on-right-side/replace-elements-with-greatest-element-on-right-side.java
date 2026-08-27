class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
            }
        int nums[]=new int[arr.length];
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max)max=arr[j];
            }
            nums[i]=max;
        }
        nums[nums.length-1]=-1;
        return nums;
    }
}