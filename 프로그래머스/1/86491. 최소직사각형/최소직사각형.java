import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] i : sizes) {
            for(int j : i) {
                list.add(j);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        int max = list.get(0);
        int min = list.get(list.size()-1);

        for(int[] i : sizes) {
            if (min < i[0] && min < i[1]) {
                min = i[0] < i[1] ? i[0] : i[1];
            }
        }
        return min * max;
    }
}