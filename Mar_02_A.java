package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_02_A{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine().toLowerCase();
            StringBuilder res = new StringBuilder();
            if(s.charAt(0)=='m'){
                res.append('m');
            }
            else{
                sb.append("NO").append('\n');
                continue mainLoop;
            }
            for(int i=1; i<n; i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    res.append(s.charAt(i));
                }
            }

            if(res.toString().equals("meow")){
                sb.append("YES").append('\n');
            }
            else{
                sb.append("NO").append('\n');
            }






        }
        System.out.println(sb);


    }
}