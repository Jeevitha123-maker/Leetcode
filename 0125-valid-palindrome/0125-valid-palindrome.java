class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'|| ch<='9' && ch>='0'){
                str+=ch;
            }
        }
        boolean f=true;
        int l=0,r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                f=false;
                break;
            }
            l++;
            r--;
        }
        return f;
    }
}