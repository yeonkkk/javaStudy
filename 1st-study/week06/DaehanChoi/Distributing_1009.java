package week6;

import java.math.BigInteger;
import java.util.Scanner;

public class Distributing_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();

        for(int i=0; i<testCaseNum; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int check = 1;

            for(int c=0; c<b; c++) {
                check = (a*check) % 10;
            }
            if(check == 0) {
                check = 10;
            }
            System.out.println(check);
        }
    }
}

/* 메모리초과
for(int i=0; i<testCaseNum; i++) {

            BigInteger a = sc.nextBigInteger();
            int b = sc.nextInt();
            BigInteger powCal = a.pow(b);
            powCal = powCal.remainder(BigInteger.TEN);

            answer[i] = powCal.intValue();
        }

        for(int j=0;j<testCaseNum;j++){
            System.out.println(answer[j]);
        }
 */