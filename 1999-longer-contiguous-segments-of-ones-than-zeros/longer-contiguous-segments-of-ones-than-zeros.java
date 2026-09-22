class Solution {
    public boolean checkZeroOnes(String s) {
        int cz=0,co=0;
        int mz=0,mo=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                co++;
                cz=0;
                mo=Math.max(mo,co);
            }
            else{
                cz++;
                co=0;
                mz=Math.max(mz,cz);
            }
        }
        return mo>mz;
    }
}