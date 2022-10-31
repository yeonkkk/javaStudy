import java.io.*;
import java.math.BigInteger;

public class BOJ_1212 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    BigInteger radix8 = new BigInteger(br.readLine(),8);

  // Out-put
    bw.write(radix8.toString(2));
    bw.close();
    br.close();
  }
}
