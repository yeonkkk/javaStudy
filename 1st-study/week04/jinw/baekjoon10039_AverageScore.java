import java.util.Scanner;

public class baekjoon10039_AverageScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;
        int score = 0;

        for (int i = 0; i < 5; i++) {
            score += sc.nextInt();
            if (score > 40) {
                result += score;
            } else {
                result += 40;
            }
            score = 0;
        }

        result = result / 5;
        System.out.println(result);
    }
}

