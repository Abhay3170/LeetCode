class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!st1.contains(nums[i]))st1.add(nums[i]);
            else return true;
        }
        return false;
    }
}