package structure.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        /**
         * STACK
         * - Collectioin package 속해있음
         * - LIFO(Last In First Out) 특징
         */

        // STACK 선언 [TYPE을 명확하게 선언하는것이 좋다고는 함.]
        Stack<Integer> inty = new Stack<Integer>(); // 뒤의 타입 생략 가능
        Stack<String> str = new Stack<>(); // String타입 선언
        Stack<Character> chr = new Stack<Character>(); // Char타입 선언

        // 값 추가
        str.push("test1");
        str.push("test2");
        str.push("test3");
        str.push("test4");
        System.out.println("값 추가 : " + str);

        // 값 삭제
        str.pop(); // stack 값 제거
        System.out.println("값 제거 : " + str); // LIFO 적용 (마지막 값부터 제거됨.)

        str.clear(); // stack 값 전체 제거
        System.out.println("값 전체 제거 : " + str);

        // STACK 크기
        str.push("test1");
        str.push("test2");
        str.push("test3");
        str.push("test4");
        System.out.println("STACK SIZE : " + str.size());

        // 값 출력
        System.out.println("처음 값 : " + str.firstElement());
        System.out.println("마지막 값 : " + str.lastElement());
        System.out.println("마지막 값 : " + str.peek());

        for(int i = 0; i < str.size(); i++){
            System.out.print("get(i) : " + str.get(i) + " // ");
        }
        System.out.println();

        for(String temp : str){
            System.out.print("배열값 출력 : " + temp + " // ");
        }
        System.out.println();

        Iterator iter = str.iterator();
        while (iter.hasNext()){
            System.out.print("iter : " + iter.next() + " // ");
        }

        System.out.println();

        // 값 검색
        System.out.println("값 검색(contains) : " + str.contains("test1")); // contains 값 검색 있을 경우 (true 반환)
        System.out.println("값 검색(index) : " + str.indexOf("test1")); // index 반환

        System.out.println("값 검색(contains) : " + str.contains("test5")); // contains 값 검색 없을 경우 (false 반환)
        System.out.println("값 검색(index) : " + str.indexOf("test5")); // index 반환없을 경우 -1

    }
}
