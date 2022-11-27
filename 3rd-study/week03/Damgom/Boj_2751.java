import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj_2751 {
    public static void main(String[] args) throws IOException {
        /*
        boj_2751 수 정렬하기 2, 정렬
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}