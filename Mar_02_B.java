package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_02_B{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] big = new int[26];
            int[] small = new int[26];

            String s = br.readLine();
            for(int i=0; i<n; i++){
                int tmp = s.charAt(i);
                if(tmp>96) small[tmp-'a']++;
                else big[tmp-'A']++;
            }

            long count = 0;
            for(int i=0; i<26; i++){
                if(big[i]>small[i]){
                    count += small[i];
                    big[i] -= small[i];
                    int tmp = big[i]/2;
                    if(k>tmp){
                        count += tmp;
                        k -= tmp;
                    }
                    else{
                        count += k;
                        k = 0;
                    }
                }
                else{
                    count += big[i];
                    small[i] -= big[i];
                    int tmp = small[i]/2;
                    if(k>tmp){
                        count += tmp;
                        k -= tmp;
                    }
                    else{
                        count += k;
                        k = 0;
                    }
                }
            }
            sb.append(count).append('\n');







        }
        System.out.println(sb);


    }
}