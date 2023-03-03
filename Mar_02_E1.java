package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_02_E1{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String a = br.readLine();
            String b = br.readLine();
            int[] A = new int[26];
            int[] B = new int[26];
            for(int i=0; i<n; i++){
                A[a.charAt(i)-'a']++;
                B[b.charAt(i)-'a']++;
            }
            for(int i=0; i<26; i++){
                if(A[i]!=B[i]){
                    sb.append("NO").append('\n');
                    continue mainLoop;
                }
            }

            if(n>=6){
                sb.append("YES").append('\n');
            }
            else{
                if(n==5){
                    if(a.charAt(2)==b.charAt(2)){
                        sb.append("YES").append('\n');
                    }
                    else sb.append("NO").append('\n');
                }
                else if(n==4){
                    if(a.charAt(1)==b.charAt(1) && a.charAt(2)==b.charAt(2) && ((a.charAt(0)==b.charAt(0) && a.charAt(3)==b.charAt(3)) || (a.charAt(0)==b.charAt(3) && a.charAt(3)==b.charAt(0)))){
                        sb.append("YES").append('\n');
                    }
                    else sb.append("NO").append('\n');
                }
                else {
                    if(a.equals(b)) sb.append("YES").append('\n');
                    else sb.append("NO").append('\n');
                }
            }








        }
        System.out.println(sb);


    }
}