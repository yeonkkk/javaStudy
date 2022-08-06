package week5;

import java.math.BigInteger;
import java.util.Scanner;

public class Empathy_14623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B1 = sc.nextLine();
        String B2 = sc.nextLine();

        BigInteger b1 = new BigInteger(B1,2);
        BigInteger b2 = new BigInteger(B2,2);
        sc.close();

        BigInteger temp = b1.multiply(b2);
        String ans = temp.toString(2);

        // 0 은 1출력
        System.out.println((ans.equals("0")) ? 1 : ans);
    }
}
