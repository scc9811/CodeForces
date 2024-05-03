package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class May_03_D{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int pb = Integer.parseInt(st.nextToken());
            int ps = Integer.parseInt(st.nextToken());
            int[] pArray = new int[n+1];
            boolean[] visitedB = new boolean[n+1];
            boolean[] visitedS = new boolean[n+1];
            st = new StringTokenizer(br.readLine());
            for(int i=1; i<=n; i++){
                pArray[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            int[] scores = new int[n+1];
            for(int i=1; i<=n; i++){
                scores[i] = Integer.parseInt(st.nextToken());
            }

            long maxBScore =  (long) scores[pb] * k;
            long currentBScore = 0;


            long maxSScore = (long) scores[ps] * k;
            long currentSScore = 0;
            boolean flag1 = true;
            boolean flag2 = true;



            for(int i=0; i<k; i++){
                if(flag1) {
                    currentSScore += scores[ps];
                    visitedS[ps] = true;
                    ps = pArray[ps];
                    maxSScore = Math.max(maxSScore, currentSScore + ((long) scores[ps] * (k - i - 1)));
                    if (visitedS[ps]) flag1 = false;
                }

                if(flag2) {
                    currentBScore += scores[pb];
                    visitedB[pb] = true;
                    pb = pArray[pb];
                    maxBScore = Math.max(maxBScore, currentBScore + ((long) scores[pb] * (k - i - 1)));
                    if (visitedB[pb]) flag2 = false;
                }

                if(!flag1 && !flag2) break;
            }





            if(maxBScore == maxSScore) {
                sb.append("Draw");
            }
            else if(maxBScore > maxSScore) {
                sb.append("Bodya");
            }
            else {
                sb.append("Sasha");
            }
            sb.append('\n');



        }
        System.out.println(sb);



    }
}