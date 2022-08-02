import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2480 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // var-init
    int dice1 = Integer.parseInt(st.nextToken());
    int dice2 = Integer.parseInt(st.nextToken());
    int dice3 = Integer.parseInt(st.nextToken());

    int result = 0;

    // Calculate
    if (dice1 == dice2 && dice2 == dice3) {
      result = 10000 + dice1 * 1000;
    } else if (dice1 == dice2 || dice1 == dice3) {
      result = 1000 + dice1 * 100;
    } else if (dice2 == dice3) {
      result = 1000 + dice2 * 100;
    } else {
      result = Math.max(dice1, Math.max(dice2, dice3)) * 100;
    }

    // Out-put
    bw.write(String.valueOf(result));

    bw.close();
    br.close();
  }
}
