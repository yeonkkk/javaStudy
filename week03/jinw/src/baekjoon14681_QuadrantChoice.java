import java.util.Scanner;

public class baekjoon14681_QuadrantChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int result = 0;

        if (input1 > 0 && input2 > 0) {
            result = 1;
        } else if (input1 > 0 && input2 <0) {
            result = 4;
        } else if (input1 < 0 && input2 < 0) {
            result = 3;
        } else {
            result = 2;
        }
        System.out.println(result);
    }
}
