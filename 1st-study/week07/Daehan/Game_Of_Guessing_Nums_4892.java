package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game_Of_Guessing_Nums_4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> answer = new ArrayList<>();
        int count = 0;

        while (true) {
            String input = bf.readLine();
            if (input.equals("0")) break;
            count++;

            //1. Even or Odd?
            String checkEvenOrOdd;

            int n1 = 3 * Integer.parseInt(input);
            //2
            int n2;
            if (n1 % 2 == 0) {
                n2 = n1 / 2;
                checkEvenOrOdd = "even";
            } else {
                n2 = (n1 + 1) / 2;
                checkEvenOrOdd = "odd";
            }
            //3
            int n3 = 3 * n2;
            //4
            int n4 = n3 / 9;
            answer.add(checkEvenOrOdd + " " + n4);
        }
        // 전체 출력
        for (int i = 0; i < count; i++) {
            System.out.printf("%d. %s\n", i + 1, answer.get(i));
        }
    }
}
