package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Feb_12_B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int n = (x-y)*2;
            sb.append(n).append('\n');
            int k = x;
            boolean minus = true;
            while(true){
                if(minus) {
                    sb.append(k--).append(' ');
                    if(k==y) minus = false;
                }
                else{
                    sb.append(k++).append(' ');
                    if(k==x) break;
                }
            }

            sb.append('\n');
        }
        System.out.println(sb);
    }
}
