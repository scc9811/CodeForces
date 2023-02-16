package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Feb_16_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            String s1 = br.readLine();
            String s2 = br.readLine();
            boolean doub = false;

            for (int i = 1; i < s1.length(); i++) {
                if (s1.charAt(i) == s1.charAt(i - 1)) {
                    if (doub) {
                        sb.append("NO").append('\n');
                        continue mainLoop;
                    } else doub = true;
                }
            }

            if (doub) {
                for(int i=1; i<s2.length(); i++){
                    if(s2.charAt(i)==s2.charAt(i-1)){
                        sb.append("NO").append('\n');
                        continue mainLoop;
                    }
                }
                if (s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1)) {
                    sb.append("NO").append('\n');
                }
                else sb.append("YES").append('\n');



            }
            else {
                boolean doub2 = false;
                for (int i = 1; i < s2.length(); i++) {
                    if (s2.charAt(i) == s2.charAt(i - 1)) {
                        if (doub2) {
                            sb.append("NO").append('\n');
                            continue mainLoop;
                        }
                        else{
                            doub2 = true;
                        }
                    }
                }
                if(doub2) {
                    if (s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1)) {
                        sb.append("NO").append('\n');
                    }
                    else sb.append("YES").append('\n');
                }
                else{
                    sb.append("YES").append('\n');
                }
            }



        }
        System.out.println(sb);


    }
}