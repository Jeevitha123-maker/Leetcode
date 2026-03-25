class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1;
        for(int i=0;i<=n || 1<=n;i++){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n=n/10;}
            return prod-sum;
        }
    }