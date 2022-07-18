package week2;

import java.math.BigInteger;
import java.util.Scanner;

public class _13277_큰수_곱셈 {
    static void cal_Long(BigInteger first, BigInteger second){
        System.out.println(first.multiply(second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger first = sc.nextBigInteger();
        BigInteger second = sc.nextBigInteger();
        cal_Long(first,second);
    }
}
