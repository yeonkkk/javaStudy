import java.math.BigInteger;
import java.util.Scanner;

//백준 2338번 긴자리 계산
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //입력조건에 10진수로 1000자리까지 나올 수 있으므로 BigInteger 를 사용한다.
        BigInteger N = input.nextBigInteger();
        BigInteger M = input.nextBigInteger();
        // BigInteger 는 연산자를 못쓰기 때문에
        // add, substract, multiply를 활용
        // ctrl + space 입력으로 쓸 수 있는 메서드들을 볼 수 있다
        System.out.println(N.add(M));
        System.out.println(N.subtract(M));
        System.out.println(N.multiply(M));
    }
}