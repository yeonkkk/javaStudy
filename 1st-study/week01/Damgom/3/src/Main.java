import java.math.BigInteger;
import java.util.Scanner;

//백준 2338번 긴자리 계산
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //입력 첫째줄 A 둘째줄 B
        // 각각의 자리가 10진수, 1000자리를 넘지 않는다.
        // 첫째줄에 A+B, 둘째 줄에 A-B, 셋째 줄게 A*B 를 출력한다.
        int A = input.nextInt();
        int B = input.nextInt();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        //입력조건에 10진수로 1000자리까지 나올 수 있으므로 BigInteger 를 사용한다.
        //int는 메모리 4바이트 -2,147,483,648 ~ 2,147,483,647
        //long 메모리 8바이트 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        //biginteger는 문자열형태 > 표현할 수 있는 범위가 무제한
        BigInteger N = input.nextBigInteger();
        BigInteger M = input.nextBigInteger();
        // BigInteger 는 연산자를 못쓰기 때문에
        // add, substract, multiply를 활용
        // ctrl + space 입력으로 쓸 수 있는 메서드들을 볼 수 있다
        // intValue(), longValue(), floatValue(), doubleValue(), toString()으로 형변환 가능
        System.out.println(N.add(M));
        System.out.println(N.subtract(M));
        System.out.println(N.multiply(M));
    }
}