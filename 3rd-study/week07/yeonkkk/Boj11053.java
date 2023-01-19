import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BOJ 11053. 가장 긴 증가하는 부분 수열
 */
public class Boj11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int result = 0;
        for (int value : dp) {
            result = Math.max(value, result);
        }

        System.out.println(result);
    }
}
