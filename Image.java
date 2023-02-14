package CodeForces;
import java.util.*;
import java.io.*;


public class Image {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            Set<Character> set = new LinkedHashSet<>();
            String s = br.readLine();
            for(int i=0; i<s.length(); i++){
                set.add(s.charAt(i));
            }
            s = br.readLine();
            for(int i=0; i<s.length(); i++){
                set.add(s.charAt(i));
            }
            sb.append(set.size()-1).append('\n');

        }
        System.out.println(sb);



    }
}
