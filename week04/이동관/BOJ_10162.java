import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10162 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    // var-init
    int input = Integer.parseInt(br.readLine());
    int[] buttons = {300, 60, 10};

    // Calculate
    for (int i = 0; i < buttons.length; i++) {
      sb.append(input / buttons[i]);
      sb.append(" ");
      input %= buttons[i];
    }
    sb.deleteCharAt(sb.length() - 1);

    // Out-put
    if (input == 0) {
      bw.write(sb.toString());
    } else {
      bw.write("-1");
    }

    bw.close();
    br.close();
  }
}
