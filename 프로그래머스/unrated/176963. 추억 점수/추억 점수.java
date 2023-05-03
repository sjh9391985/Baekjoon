import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        ConcurrentHashMap<String, Integer> scoreList = new ConcurrentHashMap<>();
    
        for(int i = 0; i < name.length; i++){
            scoreList.put(name[i], yearning[i]);    
        }
        int sum = 0;
        for(int oneDepthIndex = 0; oneDepthIndex < photo.length; oneDepthIndex++){
            for(String twoDepth : photo[oneDepthIndex]){
                if(scoreList.get(twoDepth) != null){
                    sum += scoreList.get(twoDepth);    
                }
                
            }
            answer[oneDepthIndex] = sum;
            sum = 0;
        }
        return answer;
    }
}