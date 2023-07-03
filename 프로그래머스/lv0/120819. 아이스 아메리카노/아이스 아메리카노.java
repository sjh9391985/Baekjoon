class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffeePrice = 5500;
        answer[0] = money / coffeePrice;
        answer[1] = money % coffeePrice;
        return answer;
    }
}