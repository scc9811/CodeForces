package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Nov_17_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        loop:
        while(testCase-->0){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            boolean tf = false;
            int leftIdx = -1;
            long last = -1;
            for(int l = 1; l<=n-1; l++) {
                if (!tf) {
                    System.out.printf("? %d %d\n", l, l + 1);
                    System.out.flush();
                    int response = Integer.parseInt(br.readLine());
                    if(response == 1) {
                        sb.append("01");
                        tf = true;
                        leftIdx = l;
                        last = 1;
                    }
                }
                else {
                    System.out.printf("? %d %d\n", leftIdx, l+1);
                    System.out.flush();
                    long response = Long.parseLong(br.readLine());
                    if (last == response) {
                        sb.append('0');
                    }
                    else {
                        sb.append('1');
                        last = response;
                    }
                }
            }

            if(!tf) {
                System.out.println("! IMPOSSIBLE");
                continue loop;
            }
            else {
                StringBuilder suffix = new StringBuilder();
                if (leftIdx != 1) {
                    int size = leftIdx - 1;
                    System.out.printf("? %d %d\n", 1, leftIdx+1);
                    System.out.flush();
                    long response = Long.parseLong(br.readLine());
                    for (int i=0; i<size - response + 1; i++) {
                        suffix.append('1');
                    }
                    for(int i=0; i<response-1; i++) {
                        suffix.append('0');
                    }
                }
                System.out.println("! " + suffix + sb);
            }



        }
    }
}