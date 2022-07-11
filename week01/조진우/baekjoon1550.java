import java.util.Scanner;

public class baekjoon1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();

        int integer = Integer.parseInt(hex,16);
        System.out.println(integer);
    }
}