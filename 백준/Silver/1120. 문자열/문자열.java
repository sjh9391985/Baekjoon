import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String first = sc.next();
        String second = sc.next();
        
        int res = first.length();
        
        for(int i = 0; i <= second.length()-first.length(); i++){
            
            int count = 0;
            
            for(int j = 0; j < first.length(); j++){
            
                if(first.charAt(j) != second.charAt(j+i)){
                    count++;
                }
                
            }   
            res = (res > count) ? count : res;
        }
        System.out.print(res);
    }
}