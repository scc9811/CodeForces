package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_02_D{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            long count = 1;
            for(int left=1; left<n-1; left++){
                if(s.charAt(left-1)==s.charAt(left+1)) continue;
                count++;
            }
            sb.append(count).append('\n');






        }
        System.out.println(sb);


    }
}