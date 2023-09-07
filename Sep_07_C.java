package CodeForces;

import java.io.*;
import java.util.*;

public class Sep_07_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if(r<=3) {
                sb.append(-1).append('\n');
                continue;
            }

            if(l!=r){
                if(r%2==0)sb.append(2).append(' ').append(r-2).append('\n');
                else sb.append(2).append(' ').append(r-3).append('\n');
            }
            else{
                for(int i=2; i<=Math.sqrt(r); i++){
                    if(r%i==0) {
                        sb.append(i).append(' ').append(r-i).append('\n');
                        continue mainLoop;
                    }
                }
                sb.append(-1).append('\n');
            }















        }
        System.out.println(sb);


    }
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}