package backJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 덩치_7568 {
    static List<int[]> list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        list = new ArrayList<>();

        int repeat = Integer.parseInt(br.readLine());

        for(int i=0; i<repeat; i++){
            int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(data);
        }

        for(int i=0; i< list.size(); i++){
            int rank = 1;
            int[] now = list.get(i);
            for(int j=0; j<list.size(); j++){
                if(i == j ) continue;
                int[] next = list.get(j);
                if(now[0] < next[0] && now[1] < next[1]) rank++;
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb.toString());
    }
}
