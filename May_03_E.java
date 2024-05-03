package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class May_03_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            if(n==2) {
                sb.append("1 1").append('\n');
                sb.append("1 2").append('\n').append('\n');
                continue;
            }

            if(n==3){
                sb.append("2 1").append('\n');
                sb.append("2 3").append('\n');
                sb.append("3 1").append('\n').append('\n');
                continue;
            }
            if(n==4){
                sb.append("1 1").append('\n');
                sb.append("1 3").append('\n');
                sb.append("4 3").append('\n');
                sb.append("4 4").append('\n').append('\n');
                continue;
            }
            if(n==5){
                sb.append("1 1").append('\n');
                sb.append("1 3").append('\n');
                sb.append("1 4").append('\n');
                sb.append("2 1").append('\n');
                sb.append("5 5").append('\n').append('\n');
                continue;
            }
            for(int i=1; i<=n-2; i++){
                sb.append(1).append(' ').append(i).append('\n');
            }
            sb.append(n).append(' ').append(2).append('\n');
            sb.append(n).append(' ').append(n).append('\n').append('\n');













        }
        sb.delete(sb.length()-2, sb.length());
        System.out.println(sb);



    }
}