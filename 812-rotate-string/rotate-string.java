class Solution {
    public boolean rotateString(String s, String goal) {
        String ans = s;
        ans = ans+s;

        if(goal.length() == s.length() && ans.contains(goal)){
            return true;
        }
        return false;
}
}