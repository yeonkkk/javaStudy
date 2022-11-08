package week4;

import java.util.*;

public class SangGeun_nald_5543 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> burgers = new ArrayList<>();
        List<Integer> beverages = new ArrayList<>();

        //버거배열 초기화
        for(int b=0; b<3; b++){
            burgers.add(sc.nextInt());
        }
        //음료배열 초기화
        for(int c=0;c<2; c++) {
            beverages.add(sc.nextInt());
        }
        sc.close();

        //각 배열에서 최소값을 추출해서 더하면 끝
        int minPrice = Collections.min(burgers) + Collections.min(beverages);
        System.out.println(minPrice-50);

    }
}
