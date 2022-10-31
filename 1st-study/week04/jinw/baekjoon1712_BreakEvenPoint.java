import java.util.Scanner;

public class baekjoon1712_BreakEvenPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 고정비 = a
        int b = sc.nextInt(); // 가변비 = b * n
        int c = sc.nextInt(); // 노트북 가격 = c * n

        int n = 0;

        if (b >= c) {
            System.out.println("-1");
            return ;
        }

        n = a / (c - b) + 1;
        System.out.println(n);
    }
}
