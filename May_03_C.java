package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class May_03_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n-1];
            for(int i=0; i<n-1; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int[] res = new int[n];
            res[n-1] = (int)1e9;
            for(int i=n-2; i>=0; i--){
                res[i] = res[i+1] - arr[i];
            }

            for(int i : res) {
                sb.append(i).append(' ');
            }
            sb.append('\n');







        }
        System.out.println(sb);



    }
}