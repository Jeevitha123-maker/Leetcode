class Solution {
    public int[] sortArray(int[] nums) {
        int current=0,j;
        for(int i=1;i<nums.length;i++){
            current=nums[i];
            j=i-1;
            while(j>=0 && nums[j]>current){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }return nums;
    }
}