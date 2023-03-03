package CodeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Feb_28_A{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String base = "FBFFBFFBFBFFBFFBFBFFBFFB";
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if(base.contains(s)) sb.append("YES");
            else sb.append("NO");
            sb.append('\n');






        }
        System.out.println(sb);


    }
}