class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int cl=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    cl++;
                }
                else{
                    st.pop();
                }
            }
        }
        return cl+st.size();
    }
}