import java.math.BigInteger;
import java.util.Scanner;

// 백준 10757번 큰 수 A+B
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 앞서 풀었던 BigInteger문제와 동일
        // 일반 int N = input.nextInt(); 를 하면 런타임에러 발생
        BigInteger N = input.nextBigInteger();
        BigInteger M = input.nextBigInteger();

        System.out.println(N.add(M));
    }
}