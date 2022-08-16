import java.io.*;
import java.math.BigInteger;

public class BOJ_2935 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    BigInteger A = new BigInteger(br.readLine());
    String oper = br.readLine();
    BigInteger B = new BigInteger(br.readLine());

  // Calculate
    switch (oper){
      case "+":
        bw.write(String.valueOf(A.add(B)));
        break;
      case "*":
        bw.write(String.valueOf(A.multiply(B)));
        break;
    }

  // Out-put
    bw.close();
    br.close();
  }
}
