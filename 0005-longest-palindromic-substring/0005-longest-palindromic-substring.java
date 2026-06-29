class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append("#").append(c);
        }
        sb.append("#");
        String s1=sb.toString();
        int max=0;
        int mid=0;
        int st=0;
        int p[]=new int[s1.length()];
        for(int i=0;i<s1.length();i++){
            int left=i-1;
            int right=i+1;
            while(left>=0 && right<s1.length()&&s1.charAt(left)==s1.charAt(right)){
                p[i]++;
                left--;
                right++;
            }
            if(p[i]>max){
                max=p[i];
                mid=i;
            }
            st=(mid-max)/2;
        }
        return s.substring(st,st+max);
    }
}