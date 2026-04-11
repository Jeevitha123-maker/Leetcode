class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ind[]=null;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int d=target-nums[i];
           if(!map.containsKey(d)){
                map.put(nums[i],i);
           }
           else{
            ind=new int[]{map.get(d),i};
           }
        }
        return ind;
    }
}
    