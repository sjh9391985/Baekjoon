import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int NLength = sc.nextInt(); // 길이
        String N = sc.next(); // 값
        
        char[] charArr = N.toCharArray(); // 값 -> 문자배열 변환
        int sum = 0;
        for(char c : charArr) {
            sum += c - '0';
        }
        
        System.out.print(sum);
        
    }
    
}