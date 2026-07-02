class Solution {
    public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<>();

        while(n != 1){

            if(set.contains(n)) return false;

            set.add(n);

            int h = 0;

            while(n > 0){
                int digit = n % 10;
                h+= digit * digit;
                n /= 10;
            }

            n = h;
        }

        return true;
    }
}
      
        