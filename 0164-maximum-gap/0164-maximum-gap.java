class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2) return 0;
        int max=-1;
        for(int i=0;i<nums.length-1;i++){
            int dif=nums[i+1]-nums[i];
            if(max<dif){
                max=dif;
            }
        }
        return max;
    }
}