package backJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 실버 5
public class 요세푸스_11866 {
    static List<Integer> list ;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int idx = 0;

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder("<");

        for(int i=1; i<=N; i++){
            list.add(i);
        }

        for(int i=0; i<N; i++){
            idx += K-1;
            idx %= list.size();
            int data = list.remove(idx);
            sb.append(data).append(", ");
        }

        sb.replace(sb.length()-2,sb.length(),"").append(">");
        System.out.println(sb.toString());
    }
}
