class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int candidate=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(c==0) candidate=nums[i];
            if(nums[i]==candidate){
                c++;
            }
            else{
                c--;
            }
        }
        c=0;
        for(int num:nums){
            if(num==candidate) c++;
        }
        if(c>n/2) return candidate;
        return -1;
    }
}