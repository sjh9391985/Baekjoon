import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String binaryString1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String binaryString2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            
            String res = "";
            for(int j = 0; j < n; j++){
                res += (Integer.valueOf(binaryString1.charAt(j)-'0') + Integer.valueOf(binaryString2.charAt(j)-'0') == 0) ? " " : "#";
            }
            answer[i] = res;
        }
        return answer;
    }
}