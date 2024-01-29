import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(gcd(N, M));
        System.out.println((N*M)/gcd(N,M));
    }

    public static int gcd(int N, int M) {
        if(N % M == 0){
            return M;
        }
        return gcd(M, N % M);
    }
}