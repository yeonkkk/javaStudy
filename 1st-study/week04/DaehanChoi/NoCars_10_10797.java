package week4;

import java.util.Scanner;

public class NoCars_10_10797 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int[] license = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            license[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++) {

            if (license[j] == date) count++;
        }
        System.out.println(count);
    }
}
