import java.util.Scanner;

public class baekjoon10156_Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // 과자의 가격
        int N = sc.nextInt(); // 과자의 개수
        int M = sc.nextInt(); // 현재 가진 돈

        int result = 0;

        if (K * N > M) {
            result = K * N - M;
        } else {
            result = 0;
        }
        System.out.println(result);
    }
}
