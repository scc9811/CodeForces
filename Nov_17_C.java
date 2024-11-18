package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Nov_17_C{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        loop:
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            for(int i=2; i<=n; i+=2) {
                for(int j=1; j<=n; j+=2) {
                    if (!isPrime(i+j)) {
                        for(int even=2; even<=n; even+=2) {
                            if(even == i) continue;
                            sb.append(even).append(' ');
                        }
                        sb.append(i).append(' ');
                        sb.append(j).append(' ');
                        for(int odd=1; odd<=n; odd+=2) {
                            if(odd == j) continue;
                            sb.append(odd).append(' ');
                        }
                        sb.append('\n');
                        continue loop;
                    }
                }
            }
            sb.append(-1).append(' ').append('\n');














        }
        System.out.println(sb);



    }
    static boolean isPrime(int k) {
        for(int i=2; i*i<=k; i++) {
            if(k%i==0) return false;
        }
        return true;
    }
}