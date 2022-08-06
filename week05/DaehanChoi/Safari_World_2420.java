package week5;

import java.util.Scanner;
import static java.lang.Math.*;

public class Safari_World_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        sc.close();

        //int로 계산시 오버플로우/언더플로우 발생

        System.out.println(abs(N-M));
    }
}
