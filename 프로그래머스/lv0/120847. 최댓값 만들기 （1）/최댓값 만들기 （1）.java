import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Integer[] temp = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        Arrays.sort(temp, Collections.reverseOrder());
        
        return temp[0] * temp[1];
    }
}