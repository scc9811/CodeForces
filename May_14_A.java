import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class May_14_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            if(n%2==1){
                for(int i=1; i<=n; i++){
                    sb.append(i).append(' ');
                }
            }
            else{
                for(int i=2; i<=2*n; i+=2){
                    sb.append(i).append(' ');
                }
            }
            sb.append('\n');








        }
        System.out.println(sb);



    }
}
