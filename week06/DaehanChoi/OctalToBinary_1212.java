package week6;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class OctalToBinary_1212 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BigInteger temp = sc.nextBigInteger(8);
        String BINARY = temp.toString(2);

        if ((BINARY.charAt(0)) == '0' && BINARY.contains("1")) {
            System.out.println("1" + BINARY);
        } else {
            System.out.println(BINARY);
        }
    }
}
