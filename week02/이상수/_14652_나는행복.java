package week2;

import java.util.Scanner;

public class _14652_나는행복 {
    static void findSeet(int N, int M, int K){
        int row = K/M;
        int col = K%M;

        System.out.println(row + " " + col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        findSeet(N,M,K);
    }
}
