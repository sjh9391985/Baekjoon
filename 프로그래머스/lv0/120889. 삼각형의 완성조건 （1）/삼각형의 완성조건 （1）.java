import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Integer[] side = Arrays.stream(sides).boxed().toArray(Integer[]::new);
        Arrays.sort(side, Collections.reverseOrder());
        
        return (side[0] < side[1] + side[2]) ? 1 : 2;
    }
}