class Solution {
    public String interpret(String command) {
        int i=0;
        String s="";
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                s+="G";
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                s+="o";
                i+=2;
            }
            else{
                s+="al";
                i+=4;
            }
        }
        return s;
    }
}