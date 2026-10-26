class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(a,b));
        for(int i:nums){
            pq.add(i);
        }
        int x=nums.length;
        while(x>k){
            pq.poll();
            x--;
        }
        return pq.peek();
    }
}