class Solution {
    public String addStrings(String num1, String num2) {
        int x=num1.length()-1;
        int y=num2.length()-1;
        StringBuilder s=new StringBuilder();
        int rem=0;
        while(x>=0 || y>=0 || rem>0) {
            int n=(x>=0)?Character.getNumericValue(num1.charAt(x)):0;
            int m=(y>=0)?Character.getNumericValue(num2.charAt(y)):0;
            int a=m+n+rem;
            s.append(a%10);
            rem=a/10;
            x--;
            y--;
        }
        
        return s.reverse().toString();
    }
}