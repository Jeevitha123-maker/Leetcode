class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)|| ch<='9' && ch>='0'){
                str+=ch;
            }
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev.equals(str);
    }
}