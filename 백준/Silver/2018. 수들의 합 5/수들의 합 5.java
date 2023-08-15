import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int endScore = sc.nextInt();
        
        int count = 1;
        int sum = 1;
        int start = 1;
        int end = 1;
        
        while(end != endScore){
            if(sum == endScore) {
                count++;
                end++;
                sum = sum + end;
            } else if(sum > endScore) {
                sum = sum - start;
                start++;
            } else if(sum < endScore) {
                end++;
                sum = sum + end;
            }
        }
        
        System.out.println(count);                     
    }    
}