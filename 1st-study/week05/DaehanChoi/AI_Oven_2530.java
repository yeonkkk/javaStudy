package week5;

import java.util.Arrays;
import java.util.Scanner;

public class AI_Oven_2530 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        int cookingTime = sc.nextInt();
        sc.close();

        second += cookingTime;
        if(second >= 60) {
            minute += second/60;
            second %= 60;
        }
        if(minute >=60) {
            hour += minute/60;
            minute %= 60;
        }
        if(hour >= 24) {
            hour %= 24;
        }
        System.out.printf("%d %d %d", hour, minute, second);
    }
}
