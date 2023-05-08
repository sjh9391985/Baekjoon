package structure.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableTest {

    public static void main(String[] args) {

        /**
         * - 키와 값을 1:1형태로 가져가며 HashTable에 저장
         * - 키는 값을 식별하기 위한 고유한 키, 값은 키가 가진 값을 의미
         * - HashTable에서는 null 입력이 불가능
         */

        // HashTable 선언
        Hashtable<Integer, Integer> i = new Hashtable<>(); // new는 타입 생략 가능
        Hashtable<Integer, Integer> i2 = new Hashtable<Integer, Integer>(i); // i의 Hashtable을 i3으로 값 이전
        Hashtable<Integer, Integer> i3 = new Hashtable<Integer, Integer>(10); // 초기용량 지정
        Hashtable<Integer, Integer> i4 = new Hashtable<Integer, Integer>() {{ // 변수 선언 + 초기값 지정
            put(1, 100);
            put(2, 200);
        }};

        Hashtable<String, String> str = new Hashtable<String, String>(); // String, String 타입 선언
        Hashtable<Character, Character> ch = new Hashtable<Character, Character>(); // Char, Char 타입 선언


        // 값 추가
        str.put("1", "test1");
        str.put("2", "test2");
        str.put("3", "test3");
        str.put("4", "test4");
        str.put("5", "test5");
        System.out.println("HASH TABLE 값 추가 : " + str);


        // 값 삭제
        str.remove("2");
        System.out.println("해당하는 Key 삭제 : " + str);

        str.clear();
        System.out.println("해당하는 HashTable 전체삭제 : " + str);


        // 값 출력
        str.put("1", "test1");
        str.put("2", "test2");
        str.put("3", "test3");
        str.put("4", "test4");
        str.put("5", "test5");

        for(Map.Entry< String, String> e : str.entrySet()){
            System.out.println("Key 출력 : " + e.getKey() + ", Value 출력 : " + e.getValue());
        }

        Iterator<Entry<String, String>> iter = str.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println("key : " + entry.getKey() + ", value : "+ entry.getValue());
        }

        Iterator<String> iter2 = str.keySet().iterator();
        while (iter2.hasNext()) {
            String key = iter2.next();
            System.out.println("key : " + key + ", value : "+ str.get(key));
        }

    }

}
