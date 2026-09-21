class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right){
            while(left<right&&!isvowel(s.charAt(left))){
                left++;
            }
            while(left<right&&!isvowel(s.charAt(right))){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String result=new String(arr);
        return result;
    }
    public static boolean isvowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
        return false;
    }
}