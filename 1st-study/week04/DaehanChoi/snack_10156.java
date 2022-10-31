package week4;

import java.util.Scanner;

public class snack_10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snackPrice = sc.nextInt();
        int numOfSnack = sc.nextInt();
        int currentBalance = sc.nextInt();
        int totalPrice = snackPrice*numOfSnack;
        sc.close();

        //low balance
        if(totalPrice > currentBalance){
            System.out.println(totalPrice - currentBalance);
        }
        //sufficient balance
        else
            System.out.println(0);
    }
}
