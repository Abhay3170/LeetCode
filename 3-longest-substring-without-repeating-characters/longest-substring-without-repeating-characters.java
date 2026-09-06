class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)return 0;
        if(s.length()==1)return 1;
        Set<Character> set=new HashSet<>();
        int max=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}