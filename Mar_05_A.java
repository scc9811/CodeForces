package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_05_A{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = new String[2*n-2];

            for(int i=0; i<2*n-2; i++){
                arr[i] = st.nextToken();
            }
            loop:
            for(int i=0; i<2*n-2; i++){
                String tmp = new StringBuilder(arr[i]).reverse().toString();
                for(int j=0; j<2*n-2; j++){
                    if(j==i) continue;
                    if(tmp.equals(arr[j])) continue loop;
                }
                sb.append("NO").append('\n');
                continue mainLoop;
            }
            sb.append("YES").append('\n');







        }
        System.out.println(sb);


    }
}