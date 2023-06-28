class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int count = numbers.length;
        for(int i : numbers){
            answer += i;
        }
        
        return answer/count;
    }
}