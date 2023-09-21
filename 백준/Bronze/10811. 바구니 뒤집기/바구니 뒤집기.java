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
        
        for(int loop = 0; loop < M; loop++){
            int i = sc.nextInt()-1; // 1
            int j = sc.nextInt()-1; // 2
            
            for(int index = i; index <= j; index++){
                int temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;  
                j--;
            }
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
/*
1 2 3 4 5;

2 1 3 4 5;

2 1 4 3 5;

3 4 1 2 5;
*/