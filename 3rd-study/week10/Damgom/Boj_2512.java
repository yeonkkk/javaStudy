import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2512 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2512 예산
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int budget = Integer.parseInt(st.nextToken());
            arr[i] = budget;
            sum += budget;
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        int answer = 0;
        if (sum > m) {
            for (int i = 0; i < arr.length; i++) {
                int temp = m / (arr.length - i);
                if (temp > arr[i]) {
                    m -= arr[i];
                }else {
                    answer = temp;
                    break;
                }
            }
        }else {
            answer = arr[arr.length - 1];
        }
        System.out.println(answer);
    }
}