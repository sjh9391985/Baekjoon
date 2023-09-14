import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();
        
        int min = (60 * H) + M + time;
        
        int hour = (min / 60) % 24;
        int minute = min % 60;
        System.out.print(hour + " " + minute);
    }
}