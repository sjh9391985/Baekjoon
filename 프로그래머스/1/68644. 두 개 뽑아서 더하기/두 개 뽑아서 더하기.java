import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        Collections.sort(list);
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                int res = list.get(i) + list.get(j);
                set.add(res);
            }
        }
        answer = new int[set.size()];
        
        int index = 0;
        for(int value : set){
            answer[index] = value;
            index++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}