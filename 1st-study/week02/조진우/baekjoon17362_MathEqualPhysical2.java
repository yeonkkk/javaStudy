import java.util.Scanner;

public class baekjoon17362_MathEqualPhysical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt() % 8;

        if (input == 1) System.out.println("1");
        else if (input == 0 || input == 2) System.out.println("2");
        else if (input == 3 || input == 7) System.out.println("3");
        else if (input == 4 || input == 6) System.out.println("4");
        else System.out.println("5");
    }
}
