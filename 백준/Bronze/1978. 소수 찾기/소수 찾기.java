// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성
// 4 => 1 3 5 7
import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 갯수
        int answer = 0;
        
        for(int i = 0; i < N; i++){
            int M = sc.nextInt();
            for(int j = 2; j <= M; j++){
                if(j == M){
                    answer++;
                }
                
                if(M % j == 0){
                    break;
                }
            }
        }
        
        System.out.println(answer);
        
    }
}