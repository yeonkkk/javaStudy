import java.util.Arrays;
import java.util.Scanner;

public class baekjoon5543_SangGeun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] beverage = new int[2];
        int result = 0;

        for (int i = 0; i < 3; i++) {
            burger[i] = sc.nextInt();
        }
        Arrays.sort(burger);

        for (int i = 0; i < 2; i++) {
            beverage[i] = sc.nextInt();
        }
        Arrays.sort(beverage);

        result = burger[0] + beverage[0] - 50;

        System.out.println(result);

    }
}
