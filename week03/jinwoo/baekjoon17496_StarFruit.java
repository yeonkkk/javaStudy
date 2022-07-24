import java.util.Scanner;

public class baekjoon17496_StarFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 7 여름의 일 수
        int T = sc.nextInt(); // 3 자라는데 걸리는 일 수
        int C = sc.nextInt(); // 2 심을 수 있는 칸
        int P = sc.nextInt(); // 750 가격

        int Result = (((N - 1) / T) * C) * P ;
        System.out.println(Result);

    }
}
