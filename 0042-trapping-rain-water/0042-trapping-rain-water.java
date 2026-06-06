class Solution {
    public int trap(int[] height) {
        if(height==null||height.length<3){
            return 0;
        }
        int leftmax=height[0];
        Stack<Integer> st=new Stack<>();
        st.push(height[height.length-1]);
        for(int i=height.length-2;i>=2;i--){
            st.push(Math.max(height[i],st.peek()));
        }
        int w=0;
        for(int i=1;i<height.length-1;i++){
            int minheight=Math.min(leftmax,st.peek());
            w+=Math.max(0,minheight-height[i]);
            st.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return w;
    }
}