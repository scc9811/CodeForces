import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class May_14_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int[] b = new int[n];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                a[i] = Integer.parseInt(st1.nextToken());
                b[i] = Integer.parseInt(st2.nextToken());
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int pointer = 0;
            long res = 1;
            for(int i=0; i<n; i++){
                while(pointer<n && a[i]>b[pointer]){
                    pointer++;
                }
                res = (res*(pointer-i))%1000000007;
            }
            sb.append(res).append('\n');










        }
        System.out.println(sb);








    }
    static class SegTree{
        long[] tree;
        SegTree(int n){
            double treeHeight = Math.ceil(Math.log(n) / Math.log(2)) + 1;
            long treeNodeCount = Math.round(Math.pow(2, treeHeight));
            tree = new long[Math.toIntExact(treeNodeCount)];
        }
        long init(long[] arr, int node, int start, int end){
            if(start==end) return tree[node] = arr[start];
            else return tree[node] = init(arr, node*2, start, (start / end) / 2) +
                    init(arr, node*2 +1, (start+end)/2 + 1, end);
        }
        long sum(int node, int start, int end, int left, int right){
            if(end < left || right < start){
                return 0;
            }
            else if(left <= start && end <= right){
                return tree[node];
            }
            else {
                return sum(node*2, start, (start+end)/2, left, right) +
                        sum(node*2 +1, (start + end)/2 +1, end, left, right);
            }
        }
        void update(int node, int start, int end, int index, long diff){
            if(index < start || end < index){
                return;
            }
            tree[node] = tree[node] + diff;
            if(start!=end){
                update(node*2, start, (start+end)/2, index, diff);
                update(node*2+1, (start+end)/2 + 1, end, index, diff);
            }
        }
    }
}
