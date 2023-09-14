/*
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if(x != y && x != z && y != z){
            // 모두 다른 눈
            int max = 0;
            if(x > y){
                if (z > x){
                    max = z;
                } else {
                    max = x;
                }
            } else {
                if (z > y){
                    max = z;
                } else {
                    max = y;
                }
            }
            System.out.println(max * 100);
        } else {
            if(x == y && x == z){
                System.out.println(10000 + (x * 1000));
            } else {
                if(x == y || x == z){
                    System.out.println(1000 + (x * 100));    
                } else {
                    System.out.println(1000 + (y * 100));
                }
            }
        }
    }
}