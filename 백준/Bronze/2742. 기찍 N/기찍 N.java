import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        while(num > 0) {
			System.out.println(num);
			num--;
		}
    }
    
}