import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_15964 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

  // var-init
    BigInteger num1 = new BigInteger(st.nextToken());
    BigInteger num2 = new BigInteger(st.nextToken());

  // Calculate
    BigInteger result =
        (num1.add(num2)).multiply(num1.subtract(num2));

  // Out-put
    bw.write(String.valueOf(result));
    bw.close();
  }
}
