import java.io.*;
import java.util.StringTokenizer;

public class BOJ_9498 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    int input = Integer.parseInt(br.readLine()) / 10;
    String result;

  // Calculate
    switch (input) {
      case 10:
      case 9:
        result = "A";
        break;
      case 8:
        result = "B";
        break;
      case 7:
        result = "C";
        break;
      case 6:
        result = "D";
        break;
      default:
        result = "F";
        break;
    }
  // Out-put
    bw.write(result);
    bw.close();
    br.close();
  }
}
