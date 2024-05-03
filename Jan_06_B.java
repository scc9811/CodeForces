package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jan_06_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int a = 0;
            int b = 0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='-') a++;
                else b++;
            }
            sb.append(Math.abs(a-b)).append('\n');

















        }
        System.out.println(sb);
    }
}