package season2;

import java.util.Scanner;

public class Note_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] notes = input.split(" ");
        int[] intArr = new int[notes.length];

        Boolean isContinuous = false;
        Boolean isContinuousRvs = false;

        // String arr -> int arr
        for (int i = 0; i < 8; i++) {
            intArr[i] = Integer.parseInt(notes[i]);
        }

        int index = 1;
        int rvsindex = 8;

        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[0] == 1 && i < 8) {
                if (index == intArr[i]) {
                    isContinuous = true;
                } else {
                    isContinuous = false;
                    break;
                }
                index = intArr[i] + 1;

            } else if (intArr[0] == 8 && i < 8) {
                if (rvsindex == intArr[i]) {
                    isContinuousRvs = true;
                } else {
                    isContinuousRvs = false;
                    break;
                }
                rvsindex = intArr[i] - 1;
            } else break;
        }

        if (intArr[0] == 1) {
            if (isContinuous == true) {
                System.out.println("ascending");
            } else System.out.println("mixed");
        } else if (intArr[0] == 8) {
            if (isContinuousRvs == true) {
                System.out.println("descending");
            } else System.out.println("mixed");
        } else System.out.println("mixed");


    }
}
