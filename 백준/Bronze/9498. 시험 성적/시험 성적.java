// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        char res = ' ';
        if(score >= 90){
            res = 'A';
        } else if (score >= 80 && score < 90){
            res = 'B';
        } else if (score >= 70 && score < 80){
            res = 'C';
        } else if (score >= 60 && score < 70){
            res = 'D';
        } else {
            res = 'F';
        }
        System.out.println(res);
    }
}