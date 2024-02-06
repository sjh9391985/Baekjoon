import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();

        // X 문자열에서 각 숫자의 개수를 세기
        for (char c : X.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }

        // Y 문자열에서 각 숫자의 개수를 세기
        for (char c : Y.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // X와 Y에서 공통으로 나타나는 숫자 중에서 짝꿍을 찾기
        for (char c : countX.keySet()) {
            if (countY.containsKey(c)) {
                int minCount = Math.min(countX.get(c), countY.get(c));
                for (int i = 0; i < minCount; i++) {
                    result.append(c);
                }
            }
        }

        // 결과가 없거나 0으로만 이루어진 경우
        if (result.length() == 0) {
            return "-1";
        } else if (result.toString().matches("0*")){
            return "0";
        }

        // 결과를 내림차순으로 정렬하여 문자열로 반환
        return result.reverse().toString();
    }
}
