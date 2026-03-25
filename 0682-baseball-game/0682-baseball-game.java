class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(String s:operations){
            if(s.equals("+")||s.equals("C")||s.equals("D")){
                if(s.equals("+")){
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a);
                    st.push(b);
                    st.push(a+b);
                    sum+=a+b;
                }
                else if(s.equals("C")){
                    int c=st.pop();
                    sum-=c;
                    
                }
                else if(s.equals("D")){
                    int d=2*st.peek();
                    st.push(d);
                    sum+=d;
                }
            }
            else{
                int n=Integer.parseInt(s);
                st.push(n);
                sum+=n;
            }
        }
        if(st.isEmpty()) return 0;
        return sum;
        }
    
}