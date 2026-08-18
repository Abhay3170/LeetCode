class Solution {
    public int titleToNumber(String columnTitle) {
        int s=0,c=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int p=1;
            for(int j=0;j<c;j++){
                p*=26;
            }
            s=s+(p*(char)(columnTitle.charAt(i)-64));
            c++;
        }
        return s;
    }
}