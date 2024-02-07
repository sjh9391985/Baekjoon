class Solution {
    public int solution(String t, String p) {
       int answer = 0;
        for(int i = 0; i < t.length(); i++) {
            try {
                if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) answer++;
            } catch (Exception e) {
                break;
            }
        }
        return answer;
    }
}