import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon11382_KidJeongmin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger input1 = sc.nextBigInteger();
        BigInteger input2 = sc.nextBigInteger();
        BigInteger input3 = sc.nextBigInteger();
        BigInteger result = input3.add(input1.add(input2));

        System.out.println(result);
    }
}
