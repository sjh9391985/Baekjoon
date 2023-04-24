/*
{31,28,31,30,31,30,31,31,30,31,30,31};
{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        int n = 0;
        for(int i = 0; i < m; i++){
            n += month[i];
        }   
        n += d-1;
        
        System.out.println(dow[n%7]);
        
    }
    
}