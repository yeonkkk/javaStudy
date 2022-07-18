import java.util.Scanner;

public class baekjoon14652_ImHappy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //n

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(k/m);
        System.out.println(k%m);
    }
}
