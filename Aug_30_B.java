package CodeForces;
import java.util.*;
import java.io.*;

public class Aug_30_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int res = 0;
            for(int i=0; i<n; i++){
                int cur = Integer.parseInt(st.nextToken());
                arr[cur] = true;
                if(!arr[cur-1]) res++;
            }

            sb.append(res-1).append('\n');





        }
        System.out.println(sb);







    }
}
