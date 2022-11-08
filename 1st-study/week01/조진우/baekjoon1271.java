import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger(); // 돈
        BigInteger b = sc.nextBigInteger(); // 생명체
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
}
