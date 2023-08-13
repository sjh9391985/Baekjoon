import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 받는 데이터가 많은 경우 Scanner 보단 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int quantityCount = Integer.parseInt(st.nextToken()); // 받은 숫자의 갯수
        int question = Integer.parseInt(st.nextToken()); // 받은 질의 갯수
        
        long[] la = new long[quantityCount+1]; // 숫자 데이터 사용시 범위예외로 long 사용 지향
        la[0] = 0;
        st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= quantityCount; i++) {
            la[i] = la[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int q = 0; q < question; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            System.out.println(la[j] - la[i-1]);
        }
        
        
    }
}