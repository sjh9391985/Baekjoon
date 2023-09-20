import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        
        for(int m = 0; m < M; m++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int index = i; index <= j; index++){
                arr[index-1] = k; 
            }
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
        
    }
}