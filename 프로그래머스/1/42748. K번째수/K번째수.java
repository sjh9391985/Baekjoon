import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int count = 0;
        for(int[] arr : commands) {
            int start = arr[0];
            int end = arr[1];
            
            int cnt = 0;
            int[] str = new int[end-start+1];
            for(int i = start-1; i < end; i++){
                str[cnt] = array[i];
                cnt++;
            }
            
            List<Integer> list = Arrays.asList(Arrays.stream(str).boxed().toArray(Integer[]::new));
            Collections.sort(list);
        
            answer[count] = list.get(arr[2]-1);
            count++;
        }
        
        return answer;
    }
}