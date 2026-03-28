class Solution {
    public int tribonacci(int n) {
        int te=0;
    if(n==0) return 0;
    else if(n<=2) return 1;
   else{
    int t0=0,t2=1,t1=1;
    for(int i=3;i<=n;i++){
        te=t0+t1+t2;
        t0=t1;
        t1=t2;
        t2=te;}
    }return te;
    }
}