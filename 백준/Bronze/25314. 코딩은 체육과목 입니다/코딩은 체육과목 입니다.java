import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int byteNum = sc.nextInt();
        
        String longStr = "long ";
        String res = "";
        for(int i = 4; i <= byteNum; i+=4){
            res += longStr;
        }
        System.out.println(res+"int");
         
    }
}