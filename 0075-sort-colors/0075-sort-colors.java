class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1,m=0;
        while(m<=r){
            if(nums[m]==0){
                int t=nums[m];
                nums[m]=nums[l];
                nums[l]=t;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int t=nums[r];
                nums[r]=nums[m];
                nums[m]=t;
                r--;
            }

        }
        
    }
}