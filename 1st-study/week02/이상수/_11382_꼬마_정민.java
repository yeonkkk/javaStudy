package week2;

import java.util.Scanner;

public class _11382_꼬마_정민 {
    static void calThree(long first, long second, long third){
        System.out.println(first+second+third);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long first = sc.nextLong();
        long second = sc.nextLong();
        long third = sc.nextLong();
        calThree(first,second,third);
    }
}
