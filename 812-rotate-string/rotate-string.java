class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n==0) return true;
        for(int i=0;i<n;i++){
            if(s.compareTo(goal)==0){
                return true;
            } 
            String k = s.substring(0, 1);
            s = s.substring(1);
            s = s+k;
        }
        return false;
}
}