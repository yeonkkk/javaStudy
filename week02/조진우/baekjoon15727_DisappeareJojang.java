import java.util.Scanner;

public class baekjoon15727_DisappeareJojang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int result = 0;

        if (distance % 5 != 0) {
            result = (distance / 5) + 1;
        } else {
            result = (distance / 5);
        }
        System.out.println(result);
    }
}
