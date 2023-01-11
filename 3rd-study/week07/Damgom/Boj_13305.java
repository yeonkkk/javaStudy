import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_13305 {
    public static void main(String[] args) throws IOException {
        /*
        boj_13305 주유소
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] distance = new long[n-1];
        long[] price = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < price.length; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        long result = 0;
        long minPrice = Long.MAX_VALUE;
        for (int i = 0; i < distance.length; i++) {
            minPrice = Math.min(price[i], minPrice);
            result += distance[i] * minPrice;
        }
        System.out.println(result);
    }
}