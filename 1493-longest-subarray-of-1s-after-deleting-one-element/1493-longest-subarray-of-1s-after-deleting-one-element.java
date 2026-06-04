class Solution {
    public int longestSubarray(int[] nums) {
        int j=0,k=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k++;
            }
            while(k>1){
                if(nums[j]==0){
                    k--;
                }
                j++;
            }
            max=Math.max(max,i-j);
        }
        return max;
    }
}