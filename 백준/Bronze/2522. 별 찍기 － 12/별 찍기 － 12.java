/*
  *
 **
***
 **
  *
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        // 3
        for(int i = 1; i <= num; i++){
            
            for(int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        
        for(int i = 1; i <= num -1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            
            for(int k = 0; k < num-i; k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
