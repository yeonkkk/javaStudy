import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

//        solution();
//        solution1();
//        solution2();
//        solution3();
//        solution4();
//        solution5();
        solution5();

    }

    // 엄청난 부자2 - bufferedReader 사용
    public static void solution() throws IOException {
        // 입력 받기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        StringTokenizer st = new StringTokenizer(str);
        BigInteger a = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
        BigInteger b = BigInteger.valueOf(Integer.parseInt(st.nextToken()));

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }

    // 엄청난 부자2 - scanner 사용
    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }

    // 16진수
    public static void solution2() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String hexString = bf.readLine();

        System.out.println(Integer.parseInt(hexString, 16));
    }

    // 긴자리 계산
    public static void solution3() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }

    // 웰컴
    public static void solution4() {
        System.out.println(".  .   .\n" +
                "|  | _ | _. _ ._ _  _\n" +
                "|/\\|(/.|(_.(_)[ | )(/.");
    }

    // 큰 수 A+B
    public static void solution5() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        StringTokenizer st = new StringTokenizer(str);
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        System.out.println(a.add(b));
    }

    // ??!
    public static void solution6() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println(str + "??!");
    }
}