/*
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int race = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= race; i++){
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sb.append("Case #" + String.valueOf(i) + ": " + (a + b)).append("\n"); 
        }
        
        System.out.println(sb);
    }
    
}