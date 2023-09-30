import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int index = 1; index <= number; index++){
            // 약수 구하기
            int count = 0;
            for(int j = 1; j*j <= index; j++){
                if(j*j == index){
                    count++;
                } else if(index % j == 0){
                    count += 2;
                }
            }
            answer += count > limit ? power :  count;     
        }
       
        return answer;
    }
}