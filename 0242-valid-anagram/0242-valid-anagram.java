class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
        int fr[]=new int[26];
        
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            fr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=0) return false;
        }
        return true;
    }
}