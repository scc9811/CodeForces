package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Feb_12_C {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1; i<=n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int left = 1;
            int right = n;

            boolean tf = false;
            int min = 1;
            int max = n;
            while(left<right){
                if(arr[left]==min){
                    left++;
                    min++;
                    continue;
                }
                if(arr[left]==max){
                    left++;
                    max--;
                    continue;
                }
                if(arr[right]==min){
                    right--;
                    min++;
                    continue;
                }
                if(arr[right]==max){
                    right--;
                    max--;
                    continue;
                }
                tf = true;
                sb.append(left).append(' ').append(right);
                break;
            }
            if(!tf){
                sb.append(-1);
            }
            sb.append('\n');
        }
        System.out.println(sb);


    }
}
