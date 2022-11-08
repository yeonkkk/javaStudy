import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10156 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    // var-init
    int K = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // Calculate
    if (M - (K * N) >= 0) {
      bw.write("0");
    } else {
      bw.write(String.valueOf(Math.abs(M - (K * N))));
    }
    // Out-put


    bw.close();
    br.close();
  }
}
