package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Nov_17_D{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        loop:
        while(testCase-->0){
//            System.out.println("test = "+testCase);
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
            int res = 0;
            // jang
            int[][] arr1 = new int[n][2];
            // power up
            int[][] arr2 = new int[m][2];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                arr1[i][0] = Integer.parseInt(st.nextToken());
                arr1[i][1] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
                arr2[i][0] = Integer.parseInt(st.nextToken());
                arr2[i][1] = Integer.parseInt(st.nextToken());
            }
            int jump = 1;
            int powerIdx = 0;
            for(int i=0; i<n; i++) {
                int r = arr1[i][0]-1;
                while(powerIdx < m && arr2[powerIdx][0] <= r) {
                    priorityQueue.add(new Node(arr2[powerIdx][0], arr2[powerIdx][1]));
                    powerIdx++;
                }
                int expect = arr1[i][1] - arr1[i][0] + 2;
                while(!priorityQueue.isEmpty() && jump < expect){
                    Node node = priorityQueue.poll();
                    jump += node.value;
//                    System.out.printf("%d, %d\n", node.idx, node.value);
                    res++;
                }

                if (jump < expect) {
                    sb.append(-1).append('\n');
                    continue loop;
                }
            }
            sb.append(res).append('\n');



        }
        System.out.println(sb);



    }
    static class Node implements Comparable<Node>{
        int idx, value;
        public Node(int idx, int value) {
            this.idx= idx;
            this.value = value;
        }
        public int compareTo(Node n) {
            return Integer.compare(n.value, this.value);
        }
    }
}