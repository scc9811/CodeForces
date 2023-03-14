package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_12_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            a = Math.abs(a);
            b = Math.abs(b);

            int dif = Math.abs(a - b);


            if (dif != 0) sb.append(a + b + dif - 1);
            else sb.append(a + b);
            sb.append('\n');


        }
        System.out.println(sb);


    }
}