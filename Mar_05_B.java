package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_05_B{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }



            if(arr[n-1]%6==0) arr[n-1]++;


            for(int i=n-2; i>=0; i--){
                if(arr[i]==1) arr[i]++;
                while(true){
                    if(arr[i+1]%arr[i]!=0 && arr[i]%6!=0) break;
                    arr[i]++;
                }


            }
            for(int i=0; i<n; i++){
                sb.append(arr[i]).append(' ');
            }

            sb.append('\n');







        }
        System.out.println(sb);


    }
}