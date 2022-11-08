package week7;

import java.util.Scanner;
/// 각 테스트 케이스는 한줄로 이루어져 있다!!!!!!

public class OX_Quiz_8958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //배열의 요소 개수
        //3개면 arr = [ [0XX0XX], [XXX000], [00000000] ]
        String arr[] = new String[sc.nextInt()];

        //배열에 string 하나씩 떼서 넣는다.
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.next();
        }
        sc.close();

        //테스트 케이스(배열 요소 개수) 만큼 반복
        for (int i = 0; i < arr.length; i++) {

            int points = 0;         //점수
            int totalPoints = 0;    //누적 포인트

            //배열 요소 순회 & OX 개수 판별
            for (int q = 0; q < arr[i].length(); q++) {

                if (arr[i].charAt(q) == 'O') {
                    ++points;
                } else {
                    points = 0;
                }
                //누적 포인트
                totalPoints += points;
            }
            System.out.println(totalPoints);
        }
    }
}
