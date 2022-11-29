import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_10816 {
    public static void main(String[] args) throws IOException {
        /*
        숫자 카드 2, 실버 4
        해시맵을 이용
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            map.put(a, map.getOrDefault(a,0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m-1; i++) {
            int b = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(b, 0)).append(" ");
        }
        sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()), 0));
        System.out.println(sb);
    }
}