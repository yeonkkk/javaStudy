import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11943 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

  // Var-init
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int C = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());

  // Calculate
    int result = Math.min(B + C, A + D);

  // Out-put
    bw.write(String.valueOf(result));
    bw.close();
    br.close();
  }
}
