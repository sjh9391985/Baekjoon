/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

2N - 1
*/

import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            
            
            for(int k = (2*i)-1; k <= (2*num)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = 1; i <= num-1; i++){   
            for(int j = i; j <= num-2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

