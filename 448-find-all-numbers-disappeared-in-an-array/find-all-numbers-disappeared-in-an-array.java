class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count[]=new int[nums.length+1];
        List<Integer> result=new ArrayList<>();
        for(int num:nums)
            count[num]++;
        for(int i=1;i<=nums.length;i++)
        {
            if(count[i]==0)
            {
                result.add(i);
            }
        }
        return result;
    }
}