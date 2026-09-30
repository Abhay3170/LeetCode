class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        boolean neg=num<0;
        num=Math.abs(num);
        StringBuilder s=new StringBuilder();
        while(num>0){
            int x=num%7;
            s.append(x);
            num/=7;
        }
        if(neg)s.append("-");
        return s.reverse().toString();
    }
}