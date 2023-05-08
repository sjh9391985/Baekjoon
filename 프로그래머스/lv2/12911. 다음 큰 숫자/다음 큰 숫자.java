class Solution {
    public int solution(int n) {
        int zeroLength = Integer.bitCount(n);
        int res = 0;
        for(int i = n; i< 1000000; i++){
            int resZeroLength = Integer.bitCount(res);
            if(res > n && zeroLength == resZeroLength){
                return res;
            } else {
                resZeroLength = Integer.bitCount(i+1);
                res = i+1;
            }
        }
        return res;
    }
}