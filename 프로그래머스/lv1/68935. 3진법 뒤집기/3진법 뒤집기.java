import java.util.*;

class Solution {
    public int solution(int n) {
            int answer = 0;
            String temp = "";
            while(n > 0){
                answer = n % 3;
                n = n / 3;
                temp += String.valueOf(answer);
            }

            int p = 0;
            for(int i = 0; i < temp.length(); i++){
                p += (temp.charAt(temp.length()-i-1)-'0') * (int)Math.pow(3, i);

            }
        return p;
    }
}