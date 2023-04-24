import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String b = sc.next();
           
        sc.close();
        int res = 0;
        for(int i = 0; i < a; i++){
            
            res += b.charAt(i) - '0';
            
        }
        
        System.out.println(res);
        
    }
}