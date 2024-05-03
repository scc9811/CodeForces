package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class May_03_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int x = Integer.parseInt(br.readLine());
            int max = 0;
            int maxY = 0;
            for(int i=x-1; i>=1; i--){
                int gcd = gcd(x, i);
                if(max < gcd + i) {
                    max = gcd + i;
                    maxY = i;
                }
            }

            sb.append(maxY).append('\n');













        }
        System.out.println(sb);



    }
    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}