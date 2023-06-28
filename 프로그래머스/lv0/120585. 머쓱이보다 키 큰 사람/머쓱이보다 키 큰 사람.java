class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int ans : array){
            if(height < ans){
                answer++;
            }
        }
        return answer;
    }
}