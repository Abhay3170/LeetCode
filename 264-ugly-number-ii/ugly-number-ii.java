class Solution {
    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        PriorityQueue<Long> p = new PriorityQueue<>();
        p.add(1L);
        long x = 0;
        int size = 1;
        while(size!=n){
             x = p.poll();
            if(!p.contains(x*2)){
                p.add(x*2);
            }
            if(!p.contains(x*3)){
                p.add(x*3);
            }
            if(!p.contains(x*5)){
                p.add(x*5);
            }
            size++;
        }
        x = p.poll();
        return (int)x;
    }
}