import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            String tp = clothes[i][1];
            hashmap.put(tp, hashmap.getOrDefault(tp, 0) + 1);
        }
        
        for(String key : hashmap.keySet()){
            answer *= (hashmap.get(key) + 1);
        }
        return answer-1;
    }
}