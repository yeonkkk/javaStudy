import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_10757 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    // strToken Set-up
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();

    // var-init
    BigInteger num1 = new BigInteger(st.nextToken());
    BigInteger num2 = new BigInteger(st.nextToken());

    // Calculate
    String result = String.valueOf(num1.add(num2));

    // Out-put
    bw.write(result);
    bw.close();
  }
}
