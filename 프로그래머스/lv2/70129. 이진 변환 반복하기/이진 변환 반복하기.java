class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        String zeroRemove = "";
        int zeroCount = 0;
        int count = 0;
        while(!s.equals("1")) {
            zeroRemove = s.replaceAll("0", "");
            zeroCount += s.length() - zeroRemove.length();
            s = Integer.toBinaryString(zeroRemove.length());
            count++;
        }
        answer[0] = count;
        answer[1] = zeroCount;
        return answer;
    }
}