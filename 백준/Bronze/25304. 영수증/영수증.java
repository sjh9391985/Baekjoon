import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int sum = sc.nextInt();
        int loop = sc.nextInt();
        
        for(int i = 0; i < loop; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();
            sum -= (price*num);   
        }
        if(sum == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}