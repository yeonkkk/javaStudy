import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;


//제연이는 그의 생일(2000년 3월 3일)을 기념해 자신이 가장 좋아하는 수를 20000303으로 나눈 나머지를 구해 그 수만큼 잠을 자기로 했다. 제연이가 얼마나 잠을 잘 수 있을지 구하자.
//첫째 줄에 제연이가 가장 좋아하는 수 N이 주어진다. (N ≤ 10^1,000,000)
//N을 20000303으로 나눈 나머지를 출력한다.
//20000303200003032000030320000303200003032000030320000303200003032000030320000303

public class LargeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력
        BigInteger n = scanner.nextBigInteger(); //인자 1
        int b = 20000303; //인자 2

        BigInteger c = n.mod(BigInteger.valueOf(b));

//        for (int i = 0; i < n.length(); i++) {
//            c = (c*10*(n.charAt(i)-'0'))%MOD;

        }
    }