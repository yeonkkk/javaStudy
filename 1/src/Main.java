import java.math.BigInteger;
import java.util.Scanner;

// 백준 1271 엄청난 부자2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*입력 조건에 10^1000 까지 나올 수 있기 때문에
          BigInteger를 이용
          BigInteger는 /나 % 연산이 안되기 때문에
          divide와 remainder로 나누기와 나머지를 구할 수 있었다 */
        BigInteger n = input.nextBigInteger();
        BigInteger m = input.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}