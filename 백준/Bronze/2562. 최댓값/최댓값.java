import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
                     sc.nextInt(),sc.nextInt(),sc.nextInt(),
                     sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int N = 0;
        int index = 0;
        int max = 0;
        
        for(int i = 0; i < arr.length; i++){
            N++;
            if(arr[i] > max){
                max = arr[i];
                index = N;
            }
        }
        System.out.println(max);
        System.out.println(index); 
    }
}