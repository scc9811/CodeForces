package CodeForces;
import java.util.*;
import java.io.*;

public class Jul_07_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[1000001];
        for (int k = 2; k <= 1000000; k++) {
            long sum = 1 + k + (long) k * k;
            long step = (long) k * k * k;
            while (sum <= 1000000) {
                arr[(int) sum] = true;
                sum += step;
                step *= k;
            }

        }

        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n] ? "YES" : "NO").append('\n');


        }
        System.out.println(sb);


    }
}