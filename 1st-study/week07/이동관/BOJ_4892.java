import java.io.*;
import java.util.StringTokenizer;

public class BOJ_4892 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int caseOrder = 1;
    long n0;
    long n1;
    long n2;
    long n3;
    long n4;

  // Calculate
    while( (n0 = Long.parseLong(br.readLine())) != 0){
      bw.write(String.valueOf(caseOrder));
      bw.write(". ");
      n1 = 3 * n0;
      if(n1 % 2 == 0){
        n2 = n1 / 2;
        bw.write("even ");
      } else {
        n2 = (n1 + 1) / 2;
        bw.write("odd ");
      }
      n3 = 3 * n2;
      n4 = n3 / 9;
      bw.write(String.valueOf(n4));
      bw.newLine();
      caseOrder++;
    }

  // Out-put
    bw.close();
    br.close();
  }
}
