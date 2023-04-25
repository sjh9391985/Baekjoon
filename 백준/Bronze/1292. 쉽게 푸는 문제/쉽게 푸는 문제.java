import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int firstIndex = sc.nextInt();
        int lastIndex = sc.nextInt();
        sc.close();
        
        int[] arr = new int[lastIndex];
        
        int index = 0;
        for(int i = 1; i <= lastIndex; i++){
            for(int j = 0; j < i; j++){
                if(index == lastIndex) break;
                arr[index++] = i;
            }
        }
        int res = 0;
        for(int i = firstIndex; i <= lastIndex; i++){
            res += arr[i-1];
        }
        System.out.print(res);
    }
}
