package week4;

import java.util.Scanner;

public class Microwave_10162 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int TIME_SEC = sc.nextInt();
        sc.close();

        // /sec
        int A = 300;
        int B = 60;
        int C = 10;
        int Acounts = 0;
        int Bcounts = 0;
        int Ccounts = 0;

        if(TIME_SEC >= A) {
            Acounts += TIME_SEC / A;
            TIME_SEC %= A;
        }
        if(TIME_SEC >=B) {
            Bcounts += TIME_SEC / B;
            TIME_SEC %= B;
        }
        if(TIME_SEC >= C){
            Ccounts += TIME_SEC / C;
            TIME_SEC %= C;
        }

        if(TIME_SEC != 0) System.out.println(-1);
        else System.out.printf("%d %d %d", Acounts, Bcounts, Ccounts);

    }
}
