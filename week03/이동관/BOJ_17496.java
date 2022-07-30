import java.io.*;
import java.util.StringTokenizer;

public class BOJ_17496 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

  // var-init
    int N = Integer.parseInt(st.nextToken()) - 1;
    int T = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());

  // Calculate
    long result = P * C * (N / T);
  // Out-put
    bw.write(String.valueOf(result));
    bw.close();
    br.close();
  }
}
