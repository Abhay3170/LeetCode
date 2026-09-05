class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> l1=new ArrayList<>();
            List<Integer> l2=ans.get(i-1);
            l1.add(1);
            for(int j=1;j<i;j++){
                l1.add(l2.get(j)+l2.get(j-1));
            }
            l1.add(1);
            ans.add(l1);
        }
        return ans;
    }
}