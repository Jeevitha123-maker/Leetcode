class Solution {
    public char findTheDifference(String s, String t) {
       int a=0,b=0;
       for(int i=0;i<s.length();i++){
        a+=(int)s.charAt(i);
       }for(int j=0;j<t.length();j++){
        b+=(int)t.charAt(j);
       }
        return (char)Math.abs((a-b)) ;
    }
}