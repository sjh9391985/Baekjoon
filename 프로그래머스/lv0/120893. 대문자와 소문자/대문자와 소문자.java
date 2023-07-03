class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char temp : my_string.toCharArray()){
            answer += Character.isLowerCase(temp) 
                        ? Character.toUpperCase(temp)
                        : Character.toLowerCase(temp);
        }
        return answer;
    }
}