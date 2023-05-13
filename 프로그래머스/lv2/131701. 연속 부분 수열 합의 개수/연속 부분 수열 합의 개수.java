import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int start = 1;
        Set<Integer> set = new HashSet<>();
        
        while(start <= elements.length){
            for(int i = 0; i < elements.length; i++) {
                int value = 0;
                for(int j = i; j < i + start; j++){
                    value += elements[j%elements.length];
                }
                set.add(value);
            }
            start++;
        }
        return set.size();
    }
}