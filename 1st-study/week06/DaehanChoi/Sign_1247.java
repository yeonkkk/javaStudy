package week6;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Sign_1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ans = new String[3];

        //3 Test Sets
        for(int i=0;i<3;i++) {
            int tests = sc.nextInt();

            BigInteger sum = BigInteger.ZERO;
            for(int j=0;j<tests;j++){
                sum = sum.add(sc.nextBigInteger());
            }

            if(sum.equals(BigInteger.ZERO)) {
                ans[i] = "0";
            } else if(sum.compareTo(BigInteger.ZERO) > 0){
                ans[i] = "+";
            } else if(sum.compareTo(BigInteger.ZERO) < 0) {
                ans[i] = "-";
            }
        }
        Arrays.stream(ans)
                .forEach(System.out::println);
    }
}
