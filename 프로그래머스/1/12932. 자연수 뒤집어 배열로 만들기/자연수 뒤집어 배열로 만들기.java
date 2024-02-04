class Solution {
    public int[] solution(long n) {
           String numAsString = Long.toString(n);
        int len = numAsString.length();
        int[] answer = new int[len];
        
        for (int i = len - 1; i >= 0; i--) {
            answer[len - 1 - i] = numAsString.charAt(i) - '0';
        }
        
        return answer;
    }
}