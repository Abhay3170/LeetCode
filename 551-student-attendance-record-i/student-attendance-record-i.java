class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'){
                a++;
                l=0;
                if(a>1)return false;
            }
            else if(c=='L'){
                l++;
                if(l>2)return false;
            }
            else l=0;
        }
        return true;
    }
}