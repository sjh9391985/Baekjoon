class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String compare1 : s1) {
            for(String compare2 : s2) {
                if(compare1.equals(compare2)){
                    answer++;
                }
            }
        }
        return answer;
    }
}