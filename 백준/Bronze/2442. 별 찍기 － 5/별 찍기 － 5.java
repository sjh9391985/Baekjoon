/*
[문제]
    *
   ***
  *****
 *******
*********
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < num - i; j++){
                System.out.print(" ");
            }
            
            for(int k = 1; k <= (2*i -1); k++){
                System.out.print("*");
            }
                      
            System.out.println();
        }
    }
}