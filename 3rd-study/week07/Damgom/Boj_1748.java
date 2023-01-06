import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1748 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1748 수 이어 쓰기 1
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 메모리 초과
//        String s = "";
//        for (int i = 1; i <= n; i++) {
//            s += String.valueOf(i);
//        }
//        System.out.println(s.length());
        // 시간 초과
//        int result = 0;
//        for (int i = 1; i <= n; i++) {
//            result += (int) Math.log10(i) + 1;
//        }
//        System.out.println(result);
        int num = 10;
        int pow = 1;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % num == 0) {
                pow++;
                num *= 10;
            }
            result += pow;
        }
        System.out.println(result);
    }
}