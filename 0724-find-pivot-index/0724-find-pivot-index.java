class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0,rs=0,ts=0;
        for(int num:nums) ts+=num;

        for(int i=0;i<nums.length;i++){
            rs=ts-ls-nums[i];
            if(ls==rs) return i;
            ls+=nums[i];
        }
        return -1;
    }
}