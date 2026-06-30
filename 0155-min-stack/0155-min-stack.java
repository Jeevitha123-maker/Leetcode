class MinStack {
    Stack<Integer> st;
    Stack<Integer> mn;
    public MinStack() {
        st=new Stack<>();
        mn=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(mn.isEmpty()|| val<=mn.peek()){
            mn.push(val);
        }
    }
    
    public void pop() {
        int num=st.pop();
        if(num==mn.peek())  mn.pop();
    }
    
    public int top() {
        return st.peek();
    
    }
    
    public int getMin() {
       
        return mn.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */