class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        int i=2;
        while(i<arr.length){
            if(arr[i]-arr[i-1]!=d)return false;
            i++;
        }
        return true;
    }
}