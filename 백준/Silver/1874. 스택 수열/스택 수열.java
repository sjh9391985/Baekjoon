import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 수열의 갯수
        int [] A = new int[count]; 
        
        for(int i = 0; i < count; i++){
            A[i] = sc.nextInt(); 
        }
        
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < A.length; i++){
            int su = A[i];
            if(su >= num) {
                while(su >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }   
            }
        }
        
        if(result) System.out.println(bf.toString());
        
        
    }
    
}