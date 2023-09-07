package CodeForces;


import java.io.*;
import java.util.*;

public class Sep_07_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Integer.parseInt(st.nextToken());
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());

            long gcd = gcd(x, y);
            long step = x*y/gcd;
            long res;
            res = n*(n+1)/2 - (n-n/x+n/step)*(n-n/x+n/step+1)/2 - ((n/y - n/step)*(n/y - n/step+1)/2);
            sb.append(res).append('\n');


        }
        System.out.println(sb);


    }
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}