package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class May_03_B{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String a = br.readLine();
            String b = br.readLine();

            int aIdx = 0;
            for(int i=0; i<m && aIdx < n; i++){
                if(b.charAt(i) == a.charAt(aIdx)){
                    aIdx++;
                }
            }
            sb.append(aIdx).append('\n');















        }
        System.out.println(sb);



    }
}