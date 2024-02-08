class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int sec = 2;
    
        if (n <= 3){
            return n;
            
        }else{
            for(int i = 2; i < n; i++){
                int res = first + sec;
                first = sec;
                sec = res;
            }
        }
        return sec;
    }
}