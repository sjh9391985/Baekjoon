/*

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
 
		for (int i = N; i > 0; i--) {
			for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
		}
	}
}