package CodeForces;
import java.util.*;
import java.io.*;

public class Aug_30_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            char[][] arr = new char[n][m];
            for(int i=0; i<n; i++){
                arr[i] = br.readLine().toCharArray();
            }





            for(int i=0; i<n; i++){
                int w = 0;
                int b = 0;
                int u = 0;
                for(int j=0; j<m; j++){
                    if(arr[i][j] == 'W') w++;
                    else if(arr[i][j] == 'B') b++;
                    else if(arr[i][j] == 'U') u++;
                }
                int max = (w+b+u)/2;
                if(w<0 || b<0 || (w+b+u)%2 != 0 || w>max || b>max) {
                    sb.append(-1).append('\n');
                    continue mainLoop;
                }
                for(int j=0; j<m; j++){
                    if(arr[i][j] == 'U'){
                        if(w >= max){
                            if(b >= max){
                                sb.append(-1).append('\n');
                                continue mainLoop;
                            }
                            arr[i][j] = 'B';
                            b++;
                            arr[i+1][j] = 'W';
                        }
                        else{
                            arr[i][j] = 'W';
                            w++;
                            arr[i+1][j] = 'B';
                        }
                    }
                }
            }


            for(int j=0; j<m; j++){
                int w = 0;
                int b = 0;
                int l = 0;
                for(int i=0; i<n; i++){
                    if(arr[i][j] == 'W') w++;
                    else if(arr[i][j] == 'B') b++;
                    else if(arr[i][j] == 'L') l++;
                }
                int max = (w+b+l)/2;
                if(w<0 || b<0 || (w+b+l)%2 != 0 || w>max || b>max) {
                    sb.append(-1).append('\n');
                    continue mainLoop;
                }
                for(int i=0; i<n; i++){
                    if(arr[i][j] == 'L'){
                        if(w >= max){
                            if(b >= max){
                                sb.append(-1).append('\n');
                                continue mainLoop;
                            }
                            arr[i][j] = 'B';
                            b++;
                            arr[i][j+1] = 'W';
                        }
                        else{
                            arr[i][j] = 'W';
                            w++;
                            arr[i][j+1] = 'B';
                        }
                    }
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    sb.append(arr[i][j]);
                }
                sb.append('\n');
            }



        }
        System.out.println(sb);







    }
}
