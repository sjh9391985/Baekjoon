import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String str1 = st.nextToken();
        String str2 = new StringBuilder(str1).reverse().toString();
        int result = 0;
        result = str1.equals(str2) ? 1 : 0;
        
        System.out.println(result);
        
        
    }
}