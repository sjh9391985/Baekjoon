import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String text = sc.next();
        
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            count++;
            System.out.print(text.charAt(i));
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
        
    }
}