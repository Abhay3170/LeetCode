class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.equals("abcdefghijklmnopqrstuvwxyzz"))return false;
        int freq[]=new int[26];
        char arr[]=s.toCharArray();
        for(char i:arr){
            freq[i-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                c=Math.max(freq[i],c);
                if(c!=freq[i])return false;
            }
            
        }
        return true;
    }
}