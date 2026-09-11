class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
        StringBuilder st=new StringBuilder();
        for(String i:arr){
            StringBuilder str=new StringBuilder(i);
            st.append(str.reverse());
            st.append(" ");
        }
        return st.toString().trim();
    }
}