package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Feb_12_A{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());


            long res = 0;
            if(a*m < b*(m+1)){
                res += n/(m+1)*(a*m);
                if(a<b){
                    res += n%(m+1)*a;
                }
                else{
                    res += n%(m+1)*b;
                }
            }
            else{
                res = n*b;
            }
            sb.append(res).append('\n');



        }
        System.out.println(sb);
    }
}
