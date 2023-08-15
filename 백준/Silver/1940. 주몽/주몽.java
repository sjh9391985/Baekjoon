import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int material = Integer.parseInt(br.readLine());
        int make_success = Integer.parseInt(br.readLine());
        int[] A = new int[material];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < material; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A); // 오름차순 정렬
        
        int count = 0;
        int start = 0;
        int end = material-1;
        
        while(start < end){
            if(A[start] + A[end] < make_success) {
                start++;
            } else if(A[start] + A[end] > make_success){
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}