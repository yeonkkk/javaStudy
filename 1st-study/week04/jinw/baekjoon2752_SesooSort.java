import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon2752_SesooSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < 3; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
