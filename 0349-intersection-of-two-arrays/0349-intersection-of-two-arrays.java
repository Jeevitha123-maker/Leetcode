class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int nums:nums1){
            set.add(nums);
        }
        for(int num:nums2){
            if(set.contains(num)){
                res.add(num);
            }
        }
        int a[]=new int[res.size()];
        int i=0;
        for(int nums:res){
            a[i++]=nums;
        }
        return a;
    }
}