// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
// 소수: 1과 자기 자신만을 약수로 갖는 수 (에라토스테네스의 체)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int[] arr = new int[N+1]; // 2 ~ N
          
        // 배열 초기화 과정
        for(int i = 2; i <= N; i++){
            arr[i] = i;
        }
        
        // 2부터 시작해서 i의 배수들을 배열에서 지워줌.
        for(int i = 2; i <= N; i++){
            //이미 지워진 수는 건너뛴다
            if (arr[i] == 0) continue;  
            
            for (int j = i+i; j <= N; j += i) {
                arr[j] = 0;
            }
        }
        
        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) {
                System.out.println(i);
            }
        }
        
        
        
    }
}