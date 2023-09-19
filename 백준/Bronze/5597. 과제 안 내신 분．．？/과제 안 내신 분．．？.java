import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] temp = new int[31];
        for(int i = 1; i <= 28; i++){
            int num = sc.nextInt();
            temp[num] = 1;
        }
        
        for(int i = 1; i < temp.length; i++){
            if(temp[i] != 1){
                System.out.println(i);
            }
        }
    }
}