class Solution {
    public int solution(String s) {
     
        if(s.length() >= 1 && s.length() <= 5) {
            return Integer.parseInt(s);    
        }
        
        return 0;
        
    }
}