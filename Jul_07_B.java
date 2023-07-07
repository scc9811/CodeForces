package CodeForces;

import java.util.*;
import java.io.*;

public class Jul_07_B{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int[][] arr = new int[3][3];

            for(int i=0; i<3; i++){
                String s = br.readLine();
                for(int j=0; j<3; j++){
                    char k = s.charAt(j);
                    if(k=='X') arr[i][j] = 1;
                    else if(k=='+') arr[i][j] = 10;
                    else if(k=='O') arr[i][j] = 100;
                }
            }

            int n1 = arr[0][0] + arr[0][1] + arr[0][2];
            int n2 = arr[1][0] + arr[1][1] + arr[1][2];
            int n3 = arr[2][0] + arr[2][1] + arr[2][2];
            int n4 = arr[0][0] + arr[1][0] + arr[2][0];
            int n5 = arr[0][1] + arr[1][1] + arr[2][1];
            int n6 = arr[0][2] + arr[1][2] + arr[2][2];
            int n7 = arr[0][0] + arr[1][1] + arr[2][2];
            int n8 = arr[0][2] + arr[1][1] + arr[2][0];


            int flag1 = 0;
            int flag2 = 0;
            int flag3 = 0;
            if(n1==3 || n2==3 || n3==3 || n4==3 || n5==3 || n6==3 || n7==3 || n8==3) flag1 = 1;
            if(n1==30 || n2==30 || n3==30 || n4==30 || n5==30 || n6==30 || n7==30 || n8==30) flag2 = 1;
            if(n1==300 || n2==300 || n3==300 || n4==300 || n5==300 || n6==300 || n7==300 || n8==300) flag3 = 1;

            if(flag1==1) sb.append('X');
            else if(flag2==1) sb.append('+');
            else if(flag3==1) sb.append('O');
            else sb.append("DRAW");
            sb.append('\n');







        }
        System.out.println(sb);






    }
}