class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s=new StringBuilder();
        int i=a.length()-1,j=b.length()-1;
        int rem=0;
        while(i>=0 && j>=0){
            int x=a.charAt(i)-48;
            int y=b.charAt(j)-48;
            if(x+y+rem==3){
                s.append(1);
                rem=1;
            }
            else if(x+y+rem==2){
                s.append(0);
                rem=1;
            }
            else if(x+y+rem==1){
                s.append(1);
                rem=0;
            }
            else{
                s.append(0);
                rem=0;
            }
            i--;j--;
        }
        while(i>=0){
            int x=a.charAt(i)-48;
            if(x+rem==2){
                s.append(0);
                rem=1;
            }
            else if(x+rem==1){
                s.append(1);
                rem=0;
            }
            else{
                s.append(0);
                rem=0;
            }
            i--;
        }
        while(j>=0){
            int x=b.charAt(j)-48;
            if(x+rem==2){
                s.append(0);
                rem=1;
            }
            else if(x+rem==1){
                s.append(1);
                rem=0;
            }
            else{
                s.append(0);
                rem=0;
            }
            j--;
        }
        if(rem>0){
            s.append(rem);
        }
        return s.reverse().toString();
    }
}