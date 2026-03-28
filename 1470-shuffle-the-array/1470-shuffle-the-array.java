class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,j;
        int a[]=new int [2*n];
        int k=0;
        for(i=0,j=n;i<n && j<=nums.length;i++,j++){
             a[k]=nums[i];
             a[++k]=nums[j];
             ++k;
            }return a;
        }
    }