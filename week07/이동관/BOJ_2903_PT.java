import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2903_PT {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int N = Integer.parseInt(br.readLine());
    int L = 1;
    int P = 2;

  // Calculate
    while (N > 0) {
      L = L * 2;
      P = L + 1;
      N--;
    }

    int result = P * P;

  // Out-put
    bw.write(String.valueOf(result));
    bw.close();
    br.close();
  }
}
