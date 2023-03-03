package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Feb_16_B{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] counts = new int[51];
            Seg[] segs = new Seg[n];
            int segCount = 0;
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());
                for(int j=left; j<=right; j++){
                    counts[j]++;
                }
                segs[segCount++] = new Seg(left, right);
            }

            boolean[] visitedSeg = new boolean[n];
            subLoop:
            while(true){
                boolean isResult = true;
                int maxId = -1;
                int pointValue = counts[k];
                for(int i=1; i<=50; i++){
                    if(i==k) continue;
                    if(counts[i]>=pointValue){
                        isResult = false;
                        maxId = i;
                        break;
                    }
                }
                if(isResult){
                    sb.append("YES").append('\n');
                    continue mainLoop;
                }
                else{
                    for(int i=0; i<n; i++){
                        if(visitedSeg[i]) continue;
                        else{
                            int l = segs[i].left;
                            int r = segs[i].right;
                            if((l<=maxId && r>=maxId) && (l>k || r<k)){
                                for(int j=l; j<=r; j++){
                                    counts[j]--;
                                }
                                visitedSeg[i] = true;
                                continue subLoop;
                            }
                        }
                    }
                    sb.append("NO").append('\n');
                    break;
                }
            }


        }
        System.out.println(sb);


    }
    public static class Seg{
        int left, right;
        Seg(int left, int right){
            this.left = left;
            this.right = right;
        }
    }
}