import java.util.Scanner;

// 백준 1550 16진수
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //입력
        String K = input.next();
        int N = input.nextInt(16);
        String M = input.next();

        long result = 0;
        for(int i = 0; i < M.length(); i++){
            result += solve(M.charAt(i));
        }
        System.out.println("parseInt = " + Integer.parseInt(K, 16));
        System.out.println("N = " + N);
        System.out.println("result = " + result);
    }
    public static long solve(char a) {
        if (a >= 65 && a <= 70) {
            return a - 55;
        }
        return a - 48;
    }
}