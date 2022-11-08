package season2;

import java.math.BigInteger;
import java.util.Scanner;
/*
*  방법 1: 아~ 귀찮다 -> 과감하게 BigInteger를 사용
*       (68Mb만큼 추가 메모리 사용)
*       (속도 차이는 별로 없었음)
*
*  방법 2: 그래도 나는 정석, 메모리가 중요 -> 3자리씩 잘라서 구현
*/
public class BinaryToOctalNum_1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //BigInteger octal = sc.nextBigInteger(2);
         //String ans = octal.toString(8);

        String input = sc.nextLine();
        sc.close();


        //////////////////////////////////////////////////////////


        // 3자리씩 잘라서 그걸 10진수로 바꿔서 String으로 붙이면 8진수가 됨
        // 110,011 or 10,111,000

        //3자리씩 잘랐는데 1자리 남음
        // 1110110 -> 1,110,110
        if(input.length()%3 == 1) {
            System.out.print(input.charAt(0)); // ㅁ +
        } else if(input.length()%3 == 2) { //2자리 남음
            System.out.print((input.charAt(0)-'0')*2 + (input.charAt(1)-'0') );         }

        //3자리씩 짤린 부분들 계산
        //3자리씩 잘라서 0번째는 2^0, 1번째는 2^1, 2번째는 2^2를 곱한 뒤 붙인다.

        for(int i=input.length()%3; i < input.length(); i+=3) {
            System.out.print(
                    (input.charAt(i) - '0') * 4 +
                    (input.charAt(i+1)-'0') * 2 + (input.charAt(i+2) - '0')
            );
        }
    }
}
