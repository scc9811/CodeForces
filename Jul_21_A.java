package CodeForces;

import java.util.*;
import java.io.*;

public class Jul_21_A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int base = (x%2 + y%2)%2;

            boolean tf = true;
            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                int tmpX = Integer.parseInt(st.nextToken());
                int tmpY = Integer.parseInt(st.nextToken());
                if((tmpX%2 + tmpY%2)%2 == base) {
                    tf = false;
                }
            }
            sb.append(tf ? "YES" : "NO").append('\n');


        }
        System.out.println(sb);



    }
}