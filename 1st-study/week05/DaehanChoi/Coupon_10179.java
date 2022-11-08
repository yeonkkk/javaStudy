package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coupon_10179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        List<Double> list = new ArrayList<>();

        //List에 20%할인된 가격을 2자리수에서 반올림 후 저장
        for(int i=0;i<cases;i++){
            list.add((double) Math.round((sc.nextDouble() * 0.8)*100)/100);
        }

        //List 출력
        for(int j=0;j<cases;j++){
            System.out.printf("$%.2f\n",list.get(j));
        }

    }
}
