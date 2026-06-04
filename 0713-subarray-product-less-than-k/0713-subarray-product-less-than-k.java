class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p=1,c=0,j=0;
        if(k<=1) return 0;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            while(p>=k){
                p/=nums[j];
                j++;
            }
            c+=i-j+1;
        }
        return c;
    }
}