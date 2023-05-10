import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] value = {0,0,0};
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == student1[i%5])  value[0]++;
            if(answers[i] == student2[i%8])  value[1]++;            
            if(answers[i] == student3[i%10])  value[2]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        int max = Math.max(value[0], Math.max(value[1], value[2]));
        
        for(int i = 0; i < value.length; i++){
            if(value[i] == max){
                list.add(i+1);    
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}