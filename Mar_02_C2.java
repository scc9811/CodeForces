package CodeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mar_02_C2{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(testCase-->0){
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long count = 0;


            for(int i=0; i<n; i++){
                int k = Integer.parseInt(st.nextToken());
                if(k==0){
                    if(!priorityQueue.isEmpty()){
                        count += priorityQueue.poll();
                    }
                }
                else{
                    priorityQueue.add(k);
                }
            }




            sb.append(count).append('\n');







        }
        System.out.println(sb);


    }
}