package CodeForces;

import java.util.*;
import java.io.*;

public class Jul_07_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            double sum = 0.0;
            double base = (double)d*h*0.5;
            sum += base;
            int lastH = Integer.parseInt(st.nextToken());
            for(int i=1; i<n; i++){
                int curH = Integer.parseInt(st.nextToken());
                sum += base;
                if(lastH + h > curH){
                    int height = curH-lastH;
                    sum -= base;
                    double tmp = (double)d/2 * height/h;
                    sum += (d-tmp)*height;
                }
                lastH = curH;
            }
            sb.append(sum).append('\n');






        }
        System.out.println(sb);


    }
    static class Node{
        int to;
        Node next;
        Node(int to, Node next){
            this.to = to;
            this.next = next;
        }
    }
}