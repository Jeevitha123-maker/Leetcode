class Solution {
    public int fib(int n) {
        int t1=0,t2=1;
        if(n==0 ||n==1) return n;
        for(int i=2;i<=n;i++){
                 int temp=t1;
                 t1=t2;
                 t2=temp+t1;
            
        }
        return t2;
    }
}