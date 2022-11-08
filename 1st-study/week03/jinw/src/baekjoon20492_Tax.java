import java.util.Scanner;

public class baekjoon20492_Tax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double prize = sc.nextDouble();

        System.out.print((int) (prize * 0.78) + " " + (int) (prize - (prize * 0.2 * 0.22)));
    }
}
