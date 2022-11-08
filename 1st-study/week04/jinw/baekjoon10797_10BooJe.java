import java.util.Scanner;

public class baekjoon10797_10BooJe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ip1 = sc.nextInt();
        int ip2 = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            ip2 = sc.nextInt();
            if (ip1 == ip2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
