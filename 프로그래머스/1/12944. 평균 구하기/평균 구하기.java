class Solution {
    public double solution(int[] arr) {
        int len = arr.length;
        double answer = 0.0;
        for(double i : arr) {
            answer += i;
        }
        return answer/len;   
    }
}