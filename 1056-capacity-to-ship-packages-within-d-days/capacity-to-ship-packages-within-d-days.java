class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,s=0;
        for(int i:weights) {
            if(i>max)max=i;
            s+=i;
        }
        int low=max,high=s;
        int ans=high;
        
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(isPossible(mid,weights,days)) {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int capacity,int[] weights,int days) {
        int daysNeeded=1;
        int currentLoad=0;
        for (int weight:weights) {
            if(currentLoad+weight>capacity) {
                daysNeeded++;
                currentLoad=weight;
            }
            else{
                currentLoad+=weight;
            }
        }
        
        return daysNeeded<=days;
    }
}