package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Nov_17_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        mainLoop:
        while(testCase-->0){
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<k; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            for(int i=0; i<k; i++) {
                int base = list.get(i);
                if((k-2) % base == 0) {
                    int l = 0;
                    int r = i-1;
                    int mid;
                    while (l <= r) {
                        mid = (l+r)/2;
                        long cur = (long) list.get(mid) * base;
                        if (cur == k-2) {
                            sb.append(base).append(' ').append(list.get(mid)).append('\n');
                            continue mainLoop;
                        }
                        else if (cur < k-2) {
                            l = mid + 1;
                        }
                        // cur > k-2
                        else {
                            r = mid - 1;
                        }
                    }

                    l = i+1;
                    r = k-1;
                    while (l <= r) {
                        mid = (l+r)/2;
                        long cur = (long) list.get(mid) * base;
                        if (cur == k-2) {
                            sb.append(base).append(' ').append(list.get(mid)).append('\n');
                            continue mainLoop;
                        }
                        else if (cur < k-2) {
                            l = mid + 1;
                        }
                        // cur > k-2
                        else {
                            r = mid - 1;
                        }
                    }
                }
            }












        }
        System.out.println(sb);



    }
}