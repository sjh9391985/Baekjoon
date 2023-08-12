import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        int[] score = new int[size];
        
        for(int i = 0; i < size; i++){
            score[i] = sc.nextInt();    
        }
        
        long max = 0;
        long sum = 0;
        
        for(int i = 0; i < size; i++){
            if(score[i] > max) max = score[i];
            sum += score[i];
        }
        
        System.out.print(sum*100.0/max/size);
    }
    
}