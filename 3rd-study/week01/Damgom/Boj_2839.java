import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2839 {
    public static void main(String[] args) throws IOException {
        /*
        2839 설탕배달
        설탕이 4,7kg 일 때 배달불가
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        if(n == 4 || n == 7) {
            result = -1;
        }else if(n % 5 == 1 || n % 5 == 3) {
            result = (n / 5) + 1;
        }else if(n % 5 == 2 || n % 5 == 4) {
            result = (n / 5) + 2;
        }else result = n / 5;

        System.out.println(result);
    }
}