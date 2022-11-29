import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_11399 {
    public static void main(String[] args) throws IOException {
        /*
        boj_11399, ATM
        정렬, 그리디
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] time = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        int temp = 0;
        int total = 0;
        for(int i = 0; i < time.length; i++) {
            total += time[i] + temp;
            temp += time[i];
        }
        System.out.println(total);
    }
}