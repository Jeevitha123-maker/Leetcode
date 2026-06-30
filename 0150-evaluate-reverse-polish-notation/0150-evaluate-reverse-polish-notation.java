class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st =new  Stack<>();
        int r=0;
        for(String s:tokens){
            if(!s.equals("+")&&!s.equals("*")&&!s.equals("-")&&!s.equals("/")){
                st.push(Integer.parseInt(s));
            }
            else{
                int  b=st.pop();
                int  a=st.pop();
                if(s.equals("*")){
                    r=(a*b);
                    st.push(r);
                }
                else if(s.equals("+")){
                    r=(a+b);
                    st.push(r);
                }
                 else if(s.equals("-")){
                    r=(a-b);
                    st.push(r);
                }
                else if(s.equals("/")){
                    r=(a/b);
                    st.push(r);
                }
            }
        }
        return st.pop();
    }
}