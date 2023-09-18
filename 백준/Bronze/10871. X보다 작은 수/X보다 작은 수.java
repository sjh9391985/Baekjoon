import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int compare = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int j = sc.nextInt();
            if(j < compare){
                System.out.print(j+" ");        
            }
        }
        
        
    }
}