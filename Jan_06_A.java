package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jan_06_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        loop:
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==b){
                sb.append("Bob").append('\n');
            }
            else if(a > b) {
                int c = a-b;
                if(c%2==0) sb.append("Bob").append('\n');
                else sb.append("Alice").append('\n');
            }
            else if(b > a){
                int c = b-a;
                if(c%2==0) sb.append("Bob").append('\n');
                else sb.append("Alice").append('\n');
            }

















        }
        System.out.println(sb);
    }
}