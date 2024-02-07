import java.util.*;
class Solution {
    public int solution(int[] numbers) {
         int count = 0;

        for (int i = 0; i < numbers.length - 2; i++) {
            Map<Integer, Integer> complementCount = new HashMap<>();
            int target = -numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int complement = target - numbers[j];

                // 중복을 허용하지 않도록
                if (complementCount.containsKey(complement)) {
                    count += complementCount.get(complement);
                }

                complementCount.put(numbers[j], complementCount.getOrDefault(numbers[j], 0) + 1);
            }
        }

        return count;
    }
}