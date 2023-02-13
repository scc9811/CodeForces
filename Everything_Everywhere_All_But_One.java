package CodeForces;
import java.io.*;
import java.util.*;

public class Everything_Everywhere_All_But_One {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            double sum = 0.0;
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            double div = sum/n;
            for(int i=0; i<n; i++){
                if(div==arr[i]){
                    sb.append("YES").append('\n');
                    continue mainLoop;
                }
            }
            sb.append("NO").append('\n');
        }
        System.out.println(sb);

    }
}
