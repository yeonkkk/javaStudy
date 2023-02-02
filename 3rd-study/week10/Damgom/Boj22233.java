import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj22233 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_22233 가희와 키워드
         * @Hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            memo.put(word, 1);
        }
        int answer = n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), ",");
//            성능상 문제가 있음
//            while (st.hasMoreTokens()) {
//                String temp = st.nextToken();
//                memo.remove(temp);
//            }
//            System.out.println(memo.size());
            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                if (memo.containsKey(temp)) {
                    memo.remove(temp);
                    answer--;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}