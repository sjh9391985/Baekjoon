/*

    *
   **
  ***
 ****
*****

*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lng = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i = 1; i <= lng; i++){
            for(int j = 1; j <= lng-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}