import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] nums = new int[length];
        
        int index = 0;
        while(st.hasMoreTokens()){
            nums[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        
        Arrays.sort(nums);
        System.out.println(nums[0]+ " " + nums[length-1]);
    }
}