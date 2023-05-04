import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] res = s.split(" ");
        
        for(int i=0; i<res.length; i++) {
    		String now = res[i];
    		
    		// 문자열의 길이가 0이라면(공백 이라면)
    		// answer에 " "만 추가
    		if(res[i].length() == 0) {
    			answer += " ";
    		} 
    		// 문자가 있다면
    		else {
    			// 0번째 문자는 대문자로
    			answer += now.substring(0, 1).toUpperCase();
    			// 1번째 문자부터 마지막까지는 소문자로
    			answer += now.substring(1, now.length()).toLowerCase();
    			// 마지막에 " " 추가
    			answer += " ";
    		}
    	}
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        } 
        
        return answer.substring(0, answer.length()-1);
        
    }
}