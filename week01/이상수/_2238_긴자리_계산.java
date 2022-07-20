package week1;

import java.math.BigInteger;
import java.util.Scanner;

public class _2238_긴자리_계산 {
    static void cal(BigInteger first, BigInteger second){
        System.out.println(first.add(second));
        System.out.println(first.subtract(second));
        System.out.println(first.multiply(second));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger first = scanner.nextBigInteger();
        BigInteger second = scanner.nextBigInteger();
        cal(first,second);
    }
}
