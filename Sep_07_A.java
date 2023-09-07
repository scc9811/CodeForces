package CodeForces;
import java.io.*;
import java.util.*;

public class Sep_07_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(b > a){
                int tmp = b;
                b = a;
                a = tmp;
            }

            int res = 0;
            while(a>b){
                a -= c;
                b += c;
                res++;
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