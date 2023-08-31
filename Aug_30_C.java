package CodeForces;
import java.util.*;
import java.io.*;

public class Aug_30_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n+1];
            boolean[] visited = new boolean[n+1];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                visited[arr[i]] = true;
            }
            for(int i=0; i<=n; i++){
                if(!visited[i]) {
                    arr[n] = i;
                    break;
                }
            }

            k = k%(n+1);
            int pointer = n-k+1;
            for(int i=0; i<n; i++){
                sb.append(arr[(pointer+i)%(n+1)]).append(' ');
            }
            sb.append('\n');




        }
        System.out.println(sb);







    }
}
