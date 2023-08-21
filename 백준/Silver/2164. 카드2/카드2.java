import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            myQueue.add(i);
        }
        while(myQueue.size() > 1) {
            myQueue.poll(); // 첫 번째 카드는 버린다.
            myQueue.add(myQueue.poll()); // 두번째 카드는 제일 아래로 이동.
        }   
        System.out.println(myQueue.poll());
    }
}