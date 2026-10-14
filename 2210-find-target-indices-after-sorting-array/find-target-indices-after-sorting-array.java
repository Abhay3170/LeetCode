class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int x=-1,y=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                x=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)high=mid-1;
            else low=mid+1;
        }
        low=0;high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                y=mid;
                low=mid+1;
            }
            else if(nums[mid]>target)high=mid-1;
            else low=mid+1;
        }
        if(x==-1 && y==-1)return new ArrayList<>();
        else if(x==y){
            list.add(x);
            return list;
        }
        for(int i=x;i<=y;i++){
            list.add(i);
        }
        return list;
    }
}