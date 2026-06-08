class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int v=1;
            List<Integer>l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l.add(v);
                v=v*(i-j)/(j+1);
            }
            res.add(l);
        }
        return res;
    }
}