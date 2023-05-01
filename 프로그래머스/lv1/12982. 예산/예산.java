import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        List<Integer> temp = new ArrayList<>();
        for(int t : d){
            temp.add(t);
        }

        Collections.sort(temp);
        int answer = 0;
        int count = 0;
        for(int i : temp){
            answer += i;
            if(answer <= budget){
                count++;
            }
        }

        return count;
    }
}