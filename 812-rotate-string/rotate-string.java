class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==1 && s.equals(goal))return true;
        if(s.length()==1 && !s.equals(goal))return false;
        for(int i=0;i<s.length();i++){
            s=rotate(s);
            if(goal.equals(s))return true;
        }
        return false;
    }
    public static String rotate(String si){
        return si.charAt(si.length() - 1) + si.substring(0, si.length() - 1);
    }
}