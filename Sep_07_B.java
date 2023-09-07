package CodeForces;

import java.io.*;
import java.util.*;

public class Sep_07_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[201];
            int res = (int)1e9;
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int d = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                if(arr[d]!=0) arr[d] = Math.min(arr[d], s);
                res = Math.min(res, d+(s+1)/2-1);
            }
            sb.append(res).append('\n');





        }
        System.out.println(sb);


    }
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}