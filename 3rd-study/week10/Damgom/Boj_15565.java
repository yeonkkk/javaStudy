import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_15565 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_15565 귀여운 라이언
         * @SlidingWindow
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> ryan = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int doll = Integer.parseInt(st.nextToken());
            if (doll == 1) {
                ryan.add(i);
            }
        }
        if (ryan.size() < k) {
            System.out.println(-1);
            return;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ryan.size() - k + 1; i++) {
            min = Math.min(ryan.get(k + i - 1) - ryan.get(i) + 1, min);
        }
        System.out.println(min);
    }
}