import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n%2 == 0 ? n/2 : n/2 +1];
        int count = 0;
        while(n > 0) {
            if(n%2 != 0){
                answer[count] = n;
                count++;
            }
            n--;
        }
        Arrays.sort(answer);
        return answer;
    }
}