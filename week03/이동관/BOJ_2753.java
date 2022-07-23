import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2753 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    // var-init
    int num1 = Integer.parseInt(br.readLine());
    String result = "";

    // Calculate
    if (num1 % 400 == 0) {
      result = "1";
    } else if (num1 % 4 == 0 && num1 % 100 != 0) {
      result = "1";
    } else {
      result = "0";
    }
    // Out-put
    bw.write(result);
    bw.close();
    br.close();
  }
}
