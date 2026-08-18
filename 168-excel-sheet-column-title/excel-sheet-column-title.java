class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        int n=columnNumber;
        while(n>0){
            n--;
            char c=(char)('A'+(n%26));
            s=c+s;
            n/=26;
        }
        return s;
    }
}