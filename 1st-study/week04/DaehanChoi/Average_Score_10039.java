package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Average_Score_10039 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf =
                new BufferedReader(new InputStreamReader(System.in));

        int[] scores = new int[5];

        //입력받기
        for (int i = 0; i < 5; i++) {
            scores[i] = Integer.parseInt(bf.readLine());
        }

        int sum = 0;

        //평균 계산
        for (int j = 0; j < 5; j++) {
            sum += (scores[j] < 40) ? 40 : scores[j];
        }

        System.out.println(sum / 5);
    }
}
