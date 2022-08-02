import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1712 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

  // var-init
    BigInteger fixCost = new BigInteger(st.nextToken());
    BigInteger varCost = new BigInteger(st.nextToken());
    BigInteger price = new BigInteger(st.nextToken());

    BigInteger margin = price.subtract(varCost);

    // Calculate
    if(margin.compareTo(BigInteger.ZERO) > 0){
      BigInteger breakPoint = fixCost.divide(margin).add(BigInteger.ONE);
      bw.write(breakPoint.toString());
    } else {  //  edge-case
      bw.write("-1");
    }

  // Out-put
    bw.flush();
    bw.close();
    br.close();
  }
}