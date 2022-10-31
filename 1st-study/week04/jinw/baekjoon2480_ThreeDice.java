import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2480_ThreeDice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
        int result = 0;

        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);


        if (input[0] == input[1] && input[1] == input[2]) {
            result = 10000 + (input[0] * 1000);
        } else if (input[0] == input[1]) {
            result = 1000 + (input[0] * 100);
        } else if (input[1] == input[2]) {
            result = 1000 + (input[1] * 100);
        } else {
            result = input[2] * 100;
        }

        System.out.println(result);
    }
}


//import java.util.Scanner;
//
//public class baek2480 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//        int result = 0;
//
//        if (a > 40) {
//            result += a;
//        } else {
//            result += 40;
//        }
//
//        if (b > 40) {
//            result += b;
//        } else {
//            result += 40;
//        }
//
//        if (c > 40) {
//            result += c;
//        } else {
//            result += 40;
//        }
//
//        if (d > 40) {
//            result += d;
//        } else {
//            result += 40;
//        }
//
//        if (e > 40) {
//            result += e;
//        } else {
//            result += 40;
//        }
//
//        result = result / 5;
//        System.out.println(result);
//
//    }
//}
