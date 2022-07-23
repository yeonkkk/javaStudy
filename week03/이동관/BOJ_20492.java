import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_20492 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    Integer input = Integer.parseInt(br.readLine());
    double num1 = 0.22;  //  제세공과금 과세 비율
    double num2 = 0.2;   //  필요경비가 아닌 금액의 비율

  // Calculate
    // case1 - 필요경비 인정 X : input - input * num1
    long result1 = (long) (input * (1 - num1));
    // case2 - 필요경비 80% 인정 : input - input * num2 * num1
    long result2 = (long) (input * (1 - num2 * num1));

  // Out-put
    bw.write(String.valueOf(result1));
    bw.write(" ");
    bw.write(String.valueOf(result2));
    br.close();
    bw.close();
  }
}
