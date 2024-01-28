import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int N = sc.nextInt();
            if(N == 0) break;
            int answer = 0;
            
            for(int i = N+1; i <= 2 * N; i++){
                if(isPrime(i)){
                    answer++;
                }
            }  
            System.out.println(answer);
        }   
    }
    
    public static boolean isPrime(int n) { // 소수 판별
        if(n==1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}