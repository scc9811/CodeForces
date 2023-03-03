package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Feb_28_B{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            String a = br.readLine();
            String b = br.readLine();
            if(a.length()<b.length()){
                String tmp = a;
                a = b;
                b = tmp;
            }


            for(int i=0; i<a.length()-1; i++){
                String tmp = a.substring(i, i+2);
                if(b.contains(tmp)){
                    sb.append("YES").append('\n');
                    sb.append('*').append(tmp).append('*').append('\n');
                    continue mainLoop;
                }
            }

            if(a.charAt(0)==b.charAt(0)){
                sb.append("YES").append('\n');
                sb.append(a.charAt(0)).append('*').append('\n');
                continue mainLoop;
            }
            if(a.charAt(a.length()-1)==b.charAt(b.length()-1)){
                sb.append("YES").append('\n');
                sb.append('*').append(a.charAt(a.length()-1)).append('\n');
                continue mainLoop;
            }

            sb.append("NO").append('\n');





















        }
        System.out.println(sb);


    }
}