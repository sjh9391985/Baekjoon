/*
[반대]
*****
 ****
  ***
   **
    *

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 0; i < N; i++) {
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            
			for(int j = i; j < N; j++){
                System.out.print("*");
            }
            
            System.out.println();
            
		}
	}
}