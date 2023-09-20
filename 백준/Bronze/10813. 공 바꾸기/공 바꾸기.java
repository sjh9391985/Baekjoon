import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }
        
        
        for(int count = 0; count < M; count++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
        
    }
}