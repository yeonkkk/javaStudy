import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2747 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int n = Integer.parseInt(br.readLine());

  // Calculate
    long result = tailRecursive(n, 0, 1);

  // Out-put
    bw.write(String.valueOf(result));
    bw.close();
    br.close();
  }

// Recursive-Method
  public static long tailRecursive(int n, long a, long b) {
  // edge-case
    if (n == 0) {
      return a;
  // base-case
    } else if (n == 1) {
      return b;
  // recursive-case
    } else {
      return tailRecursive(n - 1, b, a + b);
    }
  }
}
