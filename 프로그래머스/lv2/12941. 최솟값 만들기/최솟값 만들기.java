import java.util.PriorityQueue;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        //높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            priorityQueueLowest.add(A[i]);
            priorityQueueHighest.add(B[i]);
        }
        
        while (!priorityQueueLowest.isEmpty()) {
            answer += priorityQueueLowest.poll() * priorityQueueHighest.poll();
        }
        
        return answer;
    }
}