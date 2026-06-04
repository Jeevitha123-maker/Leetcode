class Solution {
    public int maxVowels(String s, int k) {
        int j=0,v=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                v++;
            }
            if(i>k-1){
                if(isVowel(s.charAt(j))){
                    v--;
                }
                j++;
            }
            max=Math.max(max,v);
        }
        return max;
    }
    public static boolean isVowel(char s){
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U') return true;
        return false;
    }
}