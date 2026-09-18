class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int x=0;
        for(int i=0;i<n;i++){
            arr[x++]=nums[i];
            arr[x++]=nums[i+n];
        }
        return arr;
    }
}