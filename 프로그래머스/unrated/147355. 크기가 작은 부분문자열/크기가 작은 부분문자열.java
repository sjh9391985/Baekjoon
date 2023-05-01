import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long tLength = t.length();
        long pLength = p.length();
        
        for(int i = 0; i <= tLength - pLength; i++){
           if(Long.parseLong(t.substring(i, i+(int)pLength)) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        
        return answer;
    }
}