package week5;

import java.util.Scanner;

public class Stick_17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStick = sc.nextInt();
        int[] sticks = new int[numOfStick];

        //높이 설정
        for (int i = 0; i < numOfStick; i++) {
            sticks[i] = sc.nextInt();
        }
        int comparison = sticks[sticks.length - 1]; //요걸로 요소 비교할거임
        int count = 1; // 맨 오른쪽 스틱 무조건 1 추가해야하므로

        for (int j = sticks.length - 2; j >= 0; j--) {
            //맨 왼쪽 막대는 따로 비교한다.
            if (j != 0) {
                //맨 오른쪽 막대보다 크면, 해당 요소를 다시 기준으로 잡음
                //기준이 된 요소보다 작을경우, 오른쪽에서 보이지 않는다.
                if (sticks[j] > comparison) {
                    ++count;
                    comparison = sticks[j];
                }
            } else {
                //맨 왼쪽 막대는 현재 기준이 된 높이보다 커야지 보이게 된다.
                if (sticks[j] > comparison) count++;
            }
        }
        System.out.println(count);
    }
}
