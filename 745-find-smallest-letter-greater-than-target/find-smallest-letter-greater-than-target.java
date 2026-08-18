class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0,j=letters.length-1;
        if(target>=letters[j]){
            return letters[0];
        }
        while(i<j){
            int m=i+(j-i)/2;
            if(letters[m]>target){
                j=m;
            }
            else{
                i=m+1;
            }
        }
        return letters[j];
    }
}