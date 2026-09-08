class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1)return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> l = new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            List<Integer> list = new ArrayList<>();
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                list.add(start);
                list.add(end);
                l.add(list);
                start=intervals[i][0];
                end=intervals[i][1];
            }
            }
            List<Integer> li=new ArrayList<>();
            li.add(start);
            li.add(end);
            l.add(li);
        int[][] arr = new int[l.size()][2];
        for (int i = 0; i < l.size(); i++) {
            List<Integer> row = l.get(i);
            arr[i][0] = row.get(0);
            arr[i][1] = row.get(1);
        }

        return arr;
    }
}