package week2;

import java.util.Scanner;

public class _15727 {
    static void sol(int len){
        if(len%5 != 0){
            System.out.println(len/5 +1);
        }else{
            System.out.println(len/5);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sol(len);
    }
}
