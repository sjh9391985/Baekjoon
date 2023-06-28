class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int count = num_list.length - 1;
        for(int num : num_list){
            answer[count] = num;
            count--;
        }
        return answer;
    }
}