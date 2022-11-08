package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arranging_Three_Nums_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String temp = bf.readLine();
        StringTokenizer tokenizer = new StringTokenizer(temp);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        bf.close();

        int TEMP = 0;

        if (arr[0] > arr[1]) {
            TEMP = arr[0];
            arr[0] = arr[1];
            arr[1] = TEMP;
        }
        if (arr[1] > arr[2]) {
            TEMP = arr[1];
            arr[1] = arr[2];
            arr[2] = TEMP;

            if (arr[0] > arr[1]) {
                TEMP = arr[0];
                arr[0] = arr[1];
                arr[1] = TEMP;
            }
        }
        System.out.printf("%d %d %d", arr[0], arr[1], arr[2]);
    }
}
