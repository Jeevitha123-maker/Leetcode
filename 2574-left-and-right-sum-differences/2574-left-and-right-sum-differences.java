class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] left=new int[nums.length];
        int []right=new int [nums.length];
        int result[]=new int [nums.length];
        left[0]=0;right[right.length-1]=0;
        int l=nums.length-1,k=0;
        if(nums.length==1){
            result[0]=0;
            return result;
        }
        for(int i=1,j=nums.length-2;i<nums.length&& j>=0;i++,j--){
          left[i]=left[k]+nums[i-1];
          right[j]=right[l]+nums[l];
          k++;
          l--;
        }for(int i=0;i<nums.length;i++){
            result[i]=Math.abs(left[i]-right[i]);
        }return result;
        }
    }