import java.io.*;
import java.util.StringTokenizer;

public class BOJ_14681 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    // var-init
    int num1 = Integer.parseInt(br.readLine());
    int num2 = Integer.parseInt(br.readLine());

    int result = 0;

    // Calculate
    if (num1 > 0) {
      if (num2 > 0) {
        result = 1;
      } else {
        result = 4;
      }
    } else if (num1 < 0) {
      if (num2 > 0) {
        result = 2;
      } else {
        result = 3;
      }
    }

    // Out-put
    bw.write(String.valueOf(result));
    bw.close();
    br.close();
  }
}
