package structure.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
      
        // 기본 type 선언방식
        LinkedList<Integer> i2 = new LinkedList<>(); // 타입 선언 생략도 가능
        LinkedList<String> s = new LinkedList<String>(); // String 타입 사용
        LinkedList<Character> ch = new LinkedList<Character>(); // Char 타입 사용

        // 선언과 동시에 초기 값 세팅
        LinkedList<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3));

        // 값 추가
        LinkedList<String> str = new LinkedList<>();
        str.add("test1");
        str.add("test2");
        str.add(1, "test3");

        // 값 변경
        str.set(0, "test0");


        // 값 삭제
        str.removeFirst(); // 첫 번째 데이터 삭제
        str.removeLast(); // 마지막 데이터 삭제
        System.out.println("값 삭제 : " + str);

        str.add("test1");
        str.add("test2");
        System.out.println("삭제 후 추가 : " + str);

        str.remove(); // 첫 번째 데이터 삭제
        System.out.println("삭제 : " + str);

        str.clear(); // 전체 삭제
        System.out.println("전체 삭제 : " + str);


        // 크기
        str.add("test1");
        str.add("test2");
        str.add("test3");
        str.add("test4");
        System.out.println("str size : " + str.size());

        // 값 출력하는 방법
        for(int i = 0; i < str.size(); i++){
            System.out.print("get 출력 : "  + str.get(i) + " // ");
        }

        System.out.println();

        for(String temp : str){
            System.out.print("배열 반복 출력 : " + temp + " // ");
        }

        System.out.println();

        Iterator iter = str.iterator();
        while (iter.hasNext()){
            System.out.print("iter 출력 : " + iter.next() + " // ");
        }

        // 값 검색하기
        System.out.println("값 검색 (contains) : " + str.contains("test1")); // 값이 있으면 true, 없으면 false

        System.out.println("값 index 검색 : " + str.indexOf("test2")); // 해당하는 값 indext 반환

        System.out.println("값 검색 (contains) : " + str.contains("test5")); //  해당하는 값 없으면 false 반환

        System.out.println("값 index 검색 : " + str.indexOf("test5")); // 해당하는 값 없으면 -1 반환


    }

}
