import java.util.Scanner;

// 백준 1550 16진수
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.next();
        // parseInt 메서드로 해결
        System.out.println(Integer.parseInt(N, 16));
    }
}