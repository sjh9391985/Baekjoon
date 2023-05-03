import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        ConcurrentHashMap<Character, Integer> map1 = new ConcurrentHashMap<>();
        ConcurrentHashMap<Character, Integer> map2 = new ConcurrentHashMap<>();
        
    for (int i = 0; i<s.length(); i++) {
        if (!map1.containsKey(s.charAt(i))) {
            map1.put(s.charAt(i), i);
            map2.put(s.charAt(i), -1);
            answer[i] = -1;
        }
        else {
            map2.put(s.charAt(i), i - map1.get(s.charAt(i)));
            map1.put(s.charAt(i), i);
            answer[i] = map2.get(s.charAt(i));
        }
    }

    return answer;
    }
}