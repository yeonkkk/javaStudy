import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_2420 {
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
    String result = num1.subtract(num2).abs().toString();

    // Out-put
    bw.write(result);
    bw.close();
    br.close();
  }
}
