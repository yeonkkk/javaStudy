import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon14928_Big {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine(); //String 반환한다.
        int remain = 0;
        for (int i = 0; i < input.length(); i++) {
            remain = (remain * 10 + (input.charAt(i)-'0')) % 20000303;
        }
        bw.write(remain + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}


/** ****시간초과가 나온 코드****
 *    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *     BigInteger input1 = new BigInteger(br.readLine());
 *     BigInteger je = new BigInteger("20000303");
 *
 *     BigInteger result = input1.mod(je);
 *
 *         System.out.println(result);
 */


/** ****Scanner를 이용한 방법. 속도가 2배 느리다..****
 * public class baekjoon14928_Big {
 *         public static void main(String[] args) throws IOException {
 *
 *             Scanner sc = new Scanner(System.in);
 *
 *             String input = sc.nextLine();
 *             long remain = 0;
 *
 *             //나머지 연산 방법
 *             for (int i = 0; i < input.length(); i++) {
 *                 remain = (remain * 10 + (input.charAt(i)-'0')) % 20000303;
 *             }
 *             System.out.println(remain);
 *         }
 *     }
 */
