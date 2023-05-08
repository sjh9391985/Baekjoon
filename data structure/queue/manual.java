package structure.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        /**
         * Collection 프레임워크
         * - 사전적의미: 줄을 서다
         * - FIFO(First In Last Out)
         * - QUEUE 앞 부분: 삭제 연산만 수행
         * - QUEUE 뒷 부분: 삽입 연산만 수행
         */

        /**
         * QUEUE 선언
         * - Queue 로 생성 X, LinkedList 생성 O
         */
        Queue<Integer> inty = new LinkedList<>(); // new부분 타입 생략 가능
        Queue<String> str = new LinkedList<String>(); // String타입 선언
        Queue<Character> chr = new LinkedList<Character>(); // Character타입 선언

        // 선언과 동시에 초기값 세팅
        Queue<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3));


        // QUEUE 값 추가
        str.add("test1");
        str.add("test2");
        str.add("test3");
        str.add("test4");
        System.out.println("값 추가 : " + str);

        // str.clear(); <- 대기열 비었을때 테스트 용도
        str.poll(); // 맨 앞의 값 제거 [대기열이 비어있을경우 null 반환]
        System.out.println("맨 앞의 값 제거 : " + str);

        str.remove(); // [대기열이 비어있을 경우 NoSuchElement 반환]
        System.out.println("맨 앞의 값 제거 : " + str);

        str.remove("test2");
        System.out.println("해당하는 값 제거 : " + str); // 해당 값이 없을 경우 그대로 출력

        str.clear();
        System.out.println("Queue 값 모두 삭제 및 초기화 : " + str);


        // 값 출력
        str.add("test1");
        str.add("test2");
        str.add("test3");
        str.add("test4");

        Iterator iter = str.iterator();
        while (iter.hasNext()){
            System.out.print("iter : " + iter.next() + " // " );
        }

    }
}
