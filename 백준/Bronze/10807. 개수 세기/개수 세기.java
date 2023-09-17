import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        
        int[] arr = new int[total];
        
        for(int i = 0; i < total; i++){
            arr[i] = sc.nextInt();
        }
        int compare = sc.nextInt();
        int count = 0;
        for(int i : arr){
            if(compare == i){
                count++;
            }
        }
        
        System.out.println(count);
        
        
    }
}