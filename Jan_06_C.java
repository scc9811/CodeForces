package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Jan_06_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();

            stack1.add((int)1e9);
            stack2.add((int)1e9);
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            for(int i=0; i<n; i++){
                int cur = Integer.parseInt(st.nextToken());
                if(stack1.peek() < stack2.peek()){
                    if(cur <= stack1.peek()){
                        stack1.add(cur);
                    }
                    else if(cur <= stack2.peek()){
                        stack2.add(cur);
                    }
                    else {
                        sum++;
                        stack1.add(cur);
                    }
                }
                else{
                    if(cur <= stack2.peek()){
                        stack2.add(cur);
                    }
                    else if(cur <= stack1.peek()){
                        stack1.add(cur);
                    }
                    else{
                        sum++;
                        stack2.add(cur);
                    }
                }
            }
            sb.append(sum).append('\n');
















        }
        System.out.println(sb);
    }
}