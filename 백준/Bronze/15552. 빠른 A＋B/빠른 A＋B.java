import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int loop = Integer.parseInt(bf.readLine());
        
        StringTokenizer st;
         
        for(int i = 0; i < loop; i++){
            st = new StringTokenizer(bf.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}