import java.io.*;
import java.math.BigInteger;

public class BOJ_1247 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int testCase = 3;

    int N = Integer.parseInt(br.readLine());

    BigInteger sum = BigInteger.ZERO;

    // Calculate
    while(testCase > 0){
      sum = sum.add(new BigInteger(br.readLine()));
      N--;

      if(N <= 0){
        switch (sum.compareTo(BigInteger.ZERO)){
          case 0:
            bw.write("0");
            break;
          case 1:
            bw.write("+");
            break;
          case -1:
            bw.write("-");
            break;
        }
        bw.newLine();
        testCase--;

        if(testCase > 0){
          N = Integer.parseInt(br.readLine());
          sum = BigInteger.ZERO;
        }
      }
    }

  // Out-put
    bw.close();
    br.close();
  }
}
