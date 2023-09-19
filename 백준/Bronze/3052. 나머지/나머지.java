import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        
        for(int i = 0; i < 10; i++){
            num[i] = (sc.nextInt() % 42) ;
        }
        int[] newArr = Arrays.stream(num).distinct().toArray();
        
        System.out.println(newArr.length);
        
    }
}