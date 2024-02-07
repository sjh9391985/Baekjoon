class Solution {
    public int solution(String s) {
        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};

        String a = "";
        for(int i = 0; i < word.length; i++){
            s = s.replaceAll(word[i], num[i]);
        }
        return Integer.parseInt(s);
    }
}