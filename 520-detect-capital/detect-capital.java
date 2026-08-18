class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        char arr[]=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z')c++;
        }
        if((c==1 && arr[0]>='A' && arr[0]<='Z') || c==arr.length || c==0)return true;
        return false;
    }
}