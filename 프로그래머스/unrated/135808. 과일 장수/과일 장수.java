import java.util.*;

class Solution {
    public int solution(int maxScore, int count, int[] score) {
        int answer = 0;
        
        Integer[] sc = Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        Arrays.sort(sc, Collections.reverseOrder());
        
        //3 3 2 2  1 1 1
        for(int i = count - 1 ;  i < sc.length ; i+= count){
            answer += (sc[i] * count);
        }
        
        return answer;
    }
}