class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;
        while(i<chars.length){
            char ch=chars[i];
            int c=0;
            while(i<chars.length && chars[i]==ch){
                i++;
                c++;
            }
            chars[j++]=ch;
            if(c>1){
                for(char x:Integer.toString(c).toCharArray()){
                    chars[j++]=x;
                }
            }
        }
        return j;
    }
}