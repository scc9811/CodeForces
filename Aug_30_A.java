package CodeForces;
import java.util.*;
import java.io.*;

public class Aug_30_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            if(n==a){
                sb.append("YES").append('\n');
                continue;
            }
            int left = n - a;
            int sum = 0;
            int plus = 0;

            for(int i=0; i<q; i++){
                if(s.charAt(i) == '-') sum--;
                else {
                    sum++;
                    plus++;
                    if(sum == left){
                        sb.append("YES").append('\n');
                        continue mainLoop;
                    }
                }
            }
            if(plus >= left){
                sb.append("MAYBE").append('\n');
            }
            else sb.append("NO").append('\n');




        }
        System.out.println(sb);







    }
}
