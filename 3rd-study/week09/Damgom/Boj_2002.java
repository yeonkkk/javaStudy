import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj_2002 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2002 추월
         * @Implementation,hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> car = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            car.put(br.readLine(), i);
        }
        int[] exit = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            exit[i] = car.get(br.readLine());
        }
        int count = 0;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (exit[i] > exit[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
