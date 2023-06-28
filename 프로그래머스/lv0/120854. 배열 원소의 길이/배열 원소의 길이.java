class Solution {
    public int[] solution(String[] strlist) {
        int answer[] = new int[strlist.length];
        int count = 0;
        for(String temp : strlist){
            answer[count] = temp.length();
            count++;
        }
        return answer;
    }
}