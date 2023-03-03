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
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            boolean case1 = true;
            boolean case2 = false;
            boolean case3 = false;
            boolean case4 = false;
            boolean res = true;
            for(int i=0; i<n; i++){
                if(case1){
                    if(s.charAt(i)=='m'|| s.charAt(i)=='M') continue;
                    else if(s.charAt(i)=='e' || s.charAt(i)=='E'){
                        case1 = false;
                        case2 = true;
                        continue;
                    }
                    else{
                        res = false;
                        break;
                    }
                }
                else if(case2){
                    if(s.charAt(i)=='e'|| s.charAt(i)=='E') continue;
                    else if(s.charAt(i)=='o' || s.charAt(i)=='O'){
                        case2 = false;
                        case3 = true;
                        continue;
                    }
                    else{
                        res = false;
                        break;
                    }
                }
                else if(case3){
                    if(s.charAt(i)=='o'|| s.charAt(i)=='O') continue;
                    else if(s.charAt(i)=='w' || s.charAt(i)=='W'){
                        case3 = false;
                        case4 = true;
                        continue;
                    }
                    else{
                        res = false;
                        break;
                    }
                }
                else if(case4){
                    if(s.charAt(i)=='w' || s.charAt(i)=='W') continue;
                    else{
                        res = false;
                        break;
                    }
                }
            }

            if(res && case4){
                sb.append("YES").append('\n');
            }
            else{
                sb.append("NO").append('\n');
            }






        }
        System.out.println(sb);


    }
}