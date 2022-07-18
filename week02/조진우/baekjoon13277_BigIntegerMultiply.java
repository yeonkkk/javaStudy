import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon13277_BigIntegerMultiply {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger input1 = sc.nextBigInteger();
        BigInteger input2 = sc.nextBigInteger();
        BigInteger result = input1.multiply(input2);

        System.out.println(result);
    }
}
