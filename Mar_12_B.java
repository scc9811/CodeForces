package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_12_B{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 명수
            int n = Integer.parseInt(st.nextToken());
            // 1팩 용량
            int k = Integer.parseInt(st.nextToken());
            // 유효기간
            int d = Integer.parseInt(st.nextToken());
            // 기다릴수있는 시간
            int w = Integer.parseInt(st.nextToken());


            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }


            int lastTime1 = -1;
            int lastTime2 = -1;
            int lastW = -1;
            long count = 0;

            for(int i=0; i<n; i++){
                // 새 팩 뜯기
                if(lastW<=0 || lastTime2<arr[i]){
                    count++;
                    lastTime1 = arr[i] + w;
                    lastTime2 = arr[i] + w + d;
                    lastW = k-1;
                }
                else{
                    lastW--;
                }


            }
            sb.append(count).append('\n');










        }
        System.out.println(sb);




    }
}