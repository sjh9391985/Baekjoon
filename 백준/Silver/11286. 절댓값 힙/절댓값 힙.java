import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            // 절댓값이 같은 경우 음수 우선
            if(first == second) return o1 > o2 ? 1 : -1;
            
            // 절댓값 작은 데이터 우선
            return first - second;
        });
        
        for(int i = 0; i < N; i++){
            int req = Integer.parseInt(br.readLine());
            if(req == 0){
                if(myQueue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(req);
            }
        }
    }
    
}