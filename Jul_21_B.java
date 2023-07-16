package CodeForces;

import java.util.*;
import java.io.*;

public class Jul_21_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] lastIdx = new int[k+1];
            Arrays.fill(lastIdx, -1);
            int[][] maxS = new int[k+1][2];
            for(int i=1; i<=k; i++){
                maxS[i][0] = -1;
                maxS[i][1] = -1;
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                int cur = Integer.parseInt(st.nextToken());
                int step = i - lastIdx[cur] -1;
                lastIdx[cur] = i;
                if(maxS[cur][0] < step){
                    maxS[cur][1] = maxS[cur][0];
                    maxS[cur][0] = step;
                }
                else if(maxS[cur][1] < step){
                    maxS[cur][1] = step;
                }
            }



            int min = (int)1e9;
            for(int i=1; i<=k; i++){
                if(lastIdx[i]!=-1){
                    int step = n - lastIdx[i] -1;
                    if(maxS[i][0] < step){
                        maxS[i][1] = maxS[i][0];
                        maxS[i][0] = step;
                    }
                    else if(maxS[i][1] < step){
                        maxS[i][1] = step;
                    }
                }
                if(maxS[i][0]!=-1){
                    if(maxS[i][1]!=-1){
                        min = Math.min(min, Math.max(maxS[i][0]/2, maxS[i][1]));
                    }
                    else min = Math.min(min, maxS[i][0]/2);
                }
            }
            sb.append(min).append('\n');









        }
        System.out.println(sb);



    }
}