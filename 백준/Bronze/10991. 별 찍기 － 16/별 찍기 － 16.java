/*
   *
  * *
 * * *
* * * *
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= num; i++){
            for(int j = i; j <= num -1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i)-1; k++){
                if(k % 2 == 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}