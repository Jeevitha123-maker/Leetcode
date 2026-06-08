class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            long v=1;
            for(int j=0;j<=i;j++){
                if(i==rowIndex) l.add((int)v);
                v=v*(i-j)/(j+1);
            }
        }
        
        return l;
    }
}