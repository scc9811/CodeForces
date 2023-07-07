package CodeForces;

import java.util.*;
import java.io.*;

public class Jul_07_C{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            // solve, penalty, index
            int[][] arr = new int[n][3];
            loop:
            for(int i=0; i<n; i++){
                int sum = 0;
                int total = 0;
                st = new StringTokenizer(br.readLine());
                int[] p = new int[m];
                for(int j=0; j<m; j++){
                    p[j] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(p);
                for(int j=0; j<m; j++){
                    int cur = p[j];
                    if(sum + cur > h){
                        arr[i][0] = j;
                        arr[i][1] = total;
                        arr[i][2] = i;
                        continue loop;
                    }
                    sum += cur;
                    total += sum;
                }
                arr[i][0] = m;
                arr[i][1] = total;
                arr[i][2] = i;
            }
            Arrays.sort(arr, (o1, o2)-> {
                if(o1[0]==o2[0]){
                    if(o1[1]==o2[1]){
                        return Integer.compare(o1[2], o2[2]);
                    }
                    return Integer.compare(o1[1], o2[1]);
                }
                return Integer.compare(o2[0], o1[0]);
            });
            for(int i=0; i<n; i++){
                if(arr[i][2]==0) {
                    sb.append(i+1).append('\n');
                    break;
                }
            }









        }
        System.out.println(sb);



    }
}