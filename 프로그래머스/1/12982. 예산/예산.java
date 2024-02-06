import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        List<Integer> list = Arrays.asList(Arrays.stream(d).boxed().toArray(Integer[]::new));
        Collections.sort(list);
        
        int plus = 0;
        int count = 0;
        for(int i : list) {
            plus += i;
            if(plus > budget) {
                break;
            } count++;
        }
        
        return count;
    }
}