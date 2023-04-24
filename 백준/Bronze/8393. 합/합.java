import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        
        int res = 0;
        for(int i = 1; i <= num; i++) {
            res += i;
        }
        
        System.out.println(res);
        
    }
    
}