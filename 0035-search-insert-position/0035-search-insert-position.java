class Solution {
    public int searchInsert(int[] nums, int target) {
        int f=0;
        int s=nums.length-1;
        while(f<=s){
            int mid=f+(s-f)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                s=mid-1;
            }
            else f=mid+1;
        }
        return f;
    }
}