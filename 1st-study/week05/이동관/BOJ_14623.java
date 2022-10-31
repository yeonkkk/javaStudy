import java.io.*;
import java.math.BigInteger;

public class BOJ_14623 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    BigInteger b1 = new BigInteger(br.readLine(), 2);
    BigInteger b2 = new BigInteger(br.readLine(), 2);
  // Calculate
    BigInteger result = b1.multiply(b2);
  // Out-put
    bw.write(result.toString(2));
    bw.close();
    br.close();
  }
}
