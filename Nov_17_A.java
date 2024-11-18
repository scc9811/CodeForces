package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Nov_17_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            int[] count = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                count[Integer.parseInt(st.nextToken())]++;
            }
            int res = 0;
            for(int i=1; i<=n; i++) {
                res += count[i]/2;
            }
            sb.append(res).append('\n');












        }
        System.out.println(sb);



    }
}