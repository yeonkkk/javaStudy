import java.math.BigInteger;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
//첫째 줄에 A+B를 출력한다.
//입력 예 : 9223372036854775807 9223372036854775808
//출력 예 : 18446744073709551615
//문제를 만든 사람: baekjoon

public class BigNumber {
    public static void main(String[] args) {

        // long의 한계 자릿수를 초과하는 정수를 제공하는 BigInteger 클래스를 사용
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("9223372036854775808");

        // BigInteger에서는 사칙연산자를 사용할 수 없다
        // +:add , -:subtract , *:multiply , /:divide , %:remainder 를 대신 사용한다
        System.out.println(a.add(b));

    }
}