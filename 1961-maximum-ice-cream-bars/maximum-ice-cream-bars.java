class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        for(int i:costs){
            if(i>coins){
                break;
            }
            coins-=i;
            count++;
        }
        return count;
    }
}