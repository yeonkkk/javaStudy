import java.text.DecimalFormat;
import java.util.Scanner;

public class baekjoon2588_Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int output = 0;
        double result = 0;

        for (int i = input2.length() - 1; i >= 0; i--) {

            int temp1 = Integer.parseInt(input1);
            int temp2 = Character.getNumericValue(input2.charAt(i));

            output = temp1 * temp2;
            System.out.println(output);
            result = result / 10 + output;
        }
        result = result * 100;
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println(format.format(result));
    }
}

