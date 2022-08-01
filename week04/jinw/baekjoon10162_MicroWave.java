import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon10162_MicroWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int[] arr = {300, 60, 10};

        ArrayList<Integer> result = new ArrayList<>();

        if (input % 10 != 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < 3; i++) {
            result.add(input / arr[i]);
            input = input % arr[i];
        }
        result.forEach(mok -> System.out.print(mok + " "));
    }
}

//
//        int MokA = input / A;
//        input = input % A;
//
//        int MokB = input / B;
//        input = input % B;
//
//        int MokC = input / C;
//
//        System.out.println(MokA + " " + MokB + " "+ MokC);
//
//    }
//}
