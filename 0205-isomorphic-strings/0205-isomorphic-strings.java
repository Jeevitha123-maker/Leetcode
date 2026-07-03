class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean flag=true;
        if(s.length()!=t.length()) return false;
        else{
            int fr[]=new int[256];
            int fq[]=new int[256];
            for(int i=0;i<s.length();i++){
              if(fr[s.charAt(i)]!=fq[t.charAt(i)]){
                    flag=false;
                    break;
                }
                fr[s.charAt(i)]=i+1;
                fq[t.charAt(i)]=i+1;
            } 
        }  
         
         if(flag) return true;
         return false;

    }
}